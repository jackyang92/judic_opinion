package com.hw.sentiment.controller;

import com.hw.sentiment.dto.sentimentsearch.Message;
import com.hw.sentiment.dto.MessageHead;
import com.hw.sentiment.dto.sentimentsearch.MessageContent;
import com.hw.sentiment.util.XMLUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ymy
 * @date 2019/12/19
 * @description 　司法案件舆情精准搜索服务订阅请求
 */
@Api(tags = "SentimentSearchController",description = "司法案件舆情精准搜索服务订阅")
@RestController
@RequestMapping("/sentiment")
public class SentimentSearchController {

    /**
     * 先把从前台接收的参数封装成xml文件，然后保存在本地，调用接口传文件获取xml数据，
     * 再把xml数据转换成对象，返回给前台
     * @param list
     * @return
     */

    @ApiOperation("按照舆情话题关键词搜索舆情案件对应的司法舆情信息")
    @PostMapping("/search")
    @ResponseBody
    public Message SentimentSearch(@RequestBody List<MessageContent> list){
        String url = "http://202.38.128.96/parse_xml_api";
        //设置消息头
        ArrayList<MessageHead> list1 = new ArrayList<>();
        MessageHead head = new MessageHead();
        head.setProtocolType("5");
        head.setMsgType("3");
        head.setMsgID("0-65535");
        head.setOperateType("3");
        head.setSendType("1");
        head.setPriority("4");
        head.setDayTime(new SimpleDateFormat("yyyy/MM/dd/hh/mm/ss").format(new Date()));
        list1.add(head);
        ArrayList<MessageContent> list2 = new ArrayList<>();
        //拿到参数值，并放入消息内容中
        MessageContent content = new MessageContent();
        for (MessageContent con : list) {
            content.setPubInfoCaseJudgeName(con.getPubInfoCaseJudgeName());
            content.setPubInfoCaseName(con.getPubInfoCaseName());
            content.setPubInfoSerialNum(con.getPubInfoSerialNum());
            content.setPubInfoKeywordNum(con.getPubInfoKeywordNum());
            content.setPubInfoKeywordArea(con.getPubInfoKeywordArea());
        }
        list2.add(content);
        Message message = new Message();
        message.setMessageHeads(list1);
        message.setMessageContents(list2);
        String s1 = XMLUtil.convertToXml(message);
        //File file = new File(s1);
        System.out.println(s1);

        File file = new File("f:\\testfile\\3.xml");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        writer.write(s1);
        writer.close();
        //创建htttpclient和httppost
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);

        String result = "";
        try {
            FileBody body = new FileBody(file);
            MultipartEntityBuilder reqEntity = MultipartEntityBuilder.create();
            reqEntity.addPart("file", body);
            HttpEntity httpEntity = reqEntity.build();
            post.setEntity(httpEntity);
            HttpResponse response = client.execute(post);
            HttpEntity responseEntity = response.getEntity();
            if (responseEntity != null) {
                result = EntityUtils.toString(responseEntity, Charset.forName("UTF-8"));
                System.out.println("======="+result);
               // 把xml转换成对象返给前台
                StringReader reader = new StringReader(result);
                JAXBContext jaxbContext = null;
                try {
                    jaxbContext = JAXBContext.newInstance(Message.class);
                    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                    Message message1 = (Message) jaxbUnmarshaller.unmarshal(reader);
                    return message1;
                } catch (JAXBException e) {
                    e.printStackTrace();
                }
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            post.releaseConnection();
        }
      return message;
    }
    }

