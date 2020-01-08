package com.hw.sentiment.controller;

import com.hw.sentiment.dto.MessageHead;
import com.hw.sentiment.dto.hottopicmonitoringinfo.Message;
import com.hw.sentiment.dto.hottopicmonitoringinfo.MessageContent;
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
import java.util.*;

/**
 * @author ymy
 * @date 2019/12/26
 * @description 司法舆情热点话题监测信息请求
 */
@Api(tags = "HotTopicMonitoringInfoController",description = "司法舆情热点话题监测信息请求")
@RestController
@RequestMapping("/hottopic")
public class HotTopicMonitoringInfoController {

    @ApiOperation("司法舆情热点话题监测信息请求")
    @PostMapping("/monitor")
    @ResponseBody
    public Message Monitor(@RequestBody Map<String,String> map){
        String url = "http://202.38.128.96/parse_xml_api";
        //设置消息头
        ArrayList<MessageHead> list1 = new ArrayList<>();
        MessageHead head = new MessageHead();
        head.setProtocolType("5");
        head.setMsgType("12");
        head.setMsgID("0-65535");
        head.setOperateType("3");
        head.setSendType("1");
        head.setPriority("4");
        head.setDayTime(new SimpleDateFormat("yyyy/MM/dd/hh/mm/ss").format(new Date()));
        list1.add(head);
        ArrayList<MessageContent> list2 = new ArrayList<>();
        //拿到参数值，并放入消息内容中
        MessageContent content = new MessageContent();
        content.setPubInfoTopicNum(map.get("PubInfoTopicNum"));
        content.setPubInfoStartTime(map.get("PubInfoStartTime"));
        content.setPubInfoEndTime(map.get("PubInfoEndTime"));
        list2.add(content);
        Message message = new Message();
        message.setMessageHeads(list1);
        message.setMessageContents(list2);
        String s1 = XMLUtil.convertToXml(message);
        System.out.println(s1);
        File file = new File("f:\\testfile\\7.xml");
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
        //创建htttpclient和httppost,调用接口传xml文件获取数据
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
