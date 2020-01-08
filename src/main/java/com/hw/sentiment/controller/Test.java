package com.hw.sentiment.controller;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

/**
 * @author ymy
 * @date 2020/1/2
 * @description 描述信息
 */
public class Test {
    public static void main(String[] args) {
        String url = "http://202.38.128.96/parse_xml_api";
        String param ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<Message>\n" +
                "\t<MessageHead DayTime=\"2019/12/30 10/06/51\" MsgID=\"0-65535\" MsgType=\"3\" OperateType=\"\" Priority=\"\" ProtocolType=\"5\" SendType=\"\"/>\n" +
                "\t<MessageContent>\n" +
                "\t\t<PubInfoSerialNum>5</PubInfoSerialNum>\n" +
                "\t\t<PubInfoKeywordNum>1</PubInfoKeywordNum>\n" +
                "\t\t<PubInfoKeywordArea>\n" +
                "\t\t\t<Keayword>杀人</Keayword>\n" +
                "\t\t</PubInfoKeywordArea>\n" +
                "\t\t<PubInfoCaseName>4·17大连大谭杀人案</PubInfoCaseName>\n" +
                "\t\t<PubInfoCaseJudgeName>5</PubInfoCaseJudgeName>\n" +
                "\t</MessageContent>\n" +
                "</Message>\n";


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
        writer.write(param);
            writer.close();

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
                return;
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            post.releaseConnection();
        }
        //return result;

       /* File file1 = new File(param);


        //响应状态是否成功
        CloseableHttpResponse response = null;
        try {
            // 浏览器表示
            post.addHeader("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.7.6)");
            // 传输的类型
            post.addHeader("Content-Type", "multipart/form-data");

            StringEntity entity = new StringEntity(file1.toString());
            post.setEntity(entity);
            response = client.execute(post);
            System.out.println("====="+response.getStatusLine().getStatusCode());
            if(response.getStatusLine().getStatusCode() == 200){
                String s = EntityUtils.toString(response.getEntity(), "UTF-8");
                System.out.println(s+"999999");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
