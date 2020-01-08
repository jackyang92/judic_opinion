package com.hw.sentiment.controller;

import cn.hutool.http.HttpUtil;
import com.hw.sentiment.dto.MessageHead;
import com.hw.sentiment.dto.topicsearch.MessageContent;
import com.hw.sentiment.dto.topicsearch.Message;
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
import java.util.HashMap;
import java.util.List;

/**
 * @author ymy
 * @date 2019/12/26
 * @description 　司法舆情话题搜索请求
 */
@Api(tags = "TopicSearchController",description = "司法舆情话题搜索请求")
@RestController
@RequestMapping("/topic")
public class TopicSearchController {

    @ApiOperation("司法舆情话题搜索请求")
    @PostMapping("/search")
    @ResponseBody
    public Message Search(@RequestBody List<MessageContent> list){
        String url = "http://202.38.128.96/parse_xml_api";
        //设置消息头
        ArrayList<MessageHead> list1 = new ArrayList<>();
        MessageHead head = new MessageHead();
        head.setProtocolType("5");
        head.setMsgType("14");
        head.setMsgID("0-65535");
        head.setOperateType("3");
        head.setSendType("1");
        head.setPriority("4");
        head.setDayTime(new SimpleDateFormat("yyyy/MM/dd/hh/mm/ss").format(new Date()));
        list1.add(head);
        ArrayList<MessageContent> list2 = new ArrayList<>();
        //拿到参数值，并放入消息内容中
        MessageContent content = new MessageContent();
        for (MessageContent msg : list) {
            content.setPubInfoSearchType(msg.getPubInfoSearchType());
            content.setTimeSearchFlag(msg.getTimeSearchFlag());
            content.setKeySearchFlag(msg.getKeySearchFlag());
            content.setRegionSearchFlag(msg.getRegionSearchFlag());
            content.setDepartmentSearchFlag(msg.getDepartmentSearchFlag());
            content.setWorkSearchFlag(msg.getWorkSearchFlag());
            content.setPubInfoStartTime(msg.getPubInfoStartTime());
            content.setPubInfoEndTime(msg.getPubInfoEndTime());
            content.setPubInfoKeywordNum(msg.getPubInfoKeywordNum());
            content.setPubInfoKeywordArea(msg.getPubInfoKeywordArea());
            content.setPubInfoTopicSourceRegion(msg.getPubInfoTopicSourceRegion());
            content.setPubInfoDepartmentLevel(msg.getPubInfoDepartmentLevel());
            content.setPubInfoDepProvince(msg.getPubInfoDepProvince());
            content.setPubInfoDepCity(msg.getPubInfoDepCity());
            content.setPubInfoTopicJusticeType(msg.getPubInfoTopicJusticeType());
        }

        list2.add(content);
       Message message = new Message();
        message.setMessageHeads(list1);
        message.setMessageContents(list2);
        String s1 = XMLUtil.convertToXml(message);
        System.out.println(s1);
        File file = new File("f:\\testfile\\9.xml");
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

