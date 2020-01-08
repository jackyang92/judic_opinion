package com.hw.sentiment.dto.eventrelationinfo;


import com.hw.sentiment.dto.sentimentsearch.PubInfoKeywordArea;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/2
 * @description 报文内容
 */
@XmlRootElement(name="MessageContent")
public class MessageContent {
   private String PubInfoTopicID;
   //应答
    private String PlatCfgRslt;
    private String PlatInfoArea;
    private String PubInfoTopicCorrelationNum;
    private List<PubInfoTopicCorrelation> PubInfoTopicCorrelationArea;

    public String getPlatCfgRslt() {
        return PlatCfgRslt;
    }
    @XmlElement(name = "PlatCfgRslt")
    public void setPlatCfgRslt(String platCfgRslt) {
        PlatCfgRslt = platCfgRslt;
    }

    public String getPlatInfoArea() {
        return PlatInfoArea;
    }
    @XmlElement(name = "PlatInfoArea")
    public void setPlatInfoArea(String platInfoArea) {
        PlatInfoArea = platInfoArea;
    }

    public String getPubInfoTopicCorrelationNum() {
        return PubInfoTopicCorrelationNum;
    }
    @XmlElement(name = "PubInfoTopicCorrelationNum")
    public void setPubInfoTopicCorrelationNum(String pubInfoTopicCorrelationNum) {
        PubInfoTopicCorrelationNum = pubInfoTopicCorrelationNum;
    }

    public List<PubInfoTopicCorrelation> getPubInfoTopicCorrelationArea() {
        return PubInfoTopicCorrelationArea;
    }

    @XmlElement(name = "PubInfoTopicCorrelationArea")
    public void setPubInfoTopicCorrelationArea(List<PubInfoTopicCorrelation> pubInfoTopicCorrelationArea) {
        PubInfoTopicCorrelationArea = pubInfoTopicCorrelationArea;
    }

    public String getPubInfoTopicID() {
        return PubInfoTopicID;
    }
    @XmlElement(name = "PubInfoTopicID")
    public void setPubInfoTopicID(String pubInfoTopicID) {
        PubInfoTopicID = pubInfoTopicID;
    }
}
