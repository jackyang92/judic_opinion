package com.hw.sentiment.dto.hottopicmonitoringinfo;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/2
 * @description 报文内容
 */
@XmlRootElement(name = "MessageContent")
public class MessageContent {
    private String PubInfoTopicNum;
    private String PubInfoStartTime;
    private String PubInfoEndTime;
    //应答
    private String PlatCfgRslt;
    private String PlatInfoArea;
    private List<PubInfoTopic> PubInfoTopicArea;

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

    public List<PubInfoTopic> getPubInfoTopicArea() {
        return PubInfoTopicArea;
    }

    @XmlElement(name = "PubInfoTopicArea")
    public void setPubInfoTopicArea(List<PubInfoTopic> pubInfoTopicArea) {
        PubInfoTopicArea = pubInfoTopicArea;
    }

    public String getPubInfoTopicNum() {
        return PubInfoTopicNum;
    }

    @XmlElement(name = "PubInfoTopicNum")
    public void setPubInfoTopicNum(String pubInfoTopicNum) {
        PubInfoTopicNum = pubInfoTopicNum;
    }

    public String getPubInfoStartTime() {
        return PubInfoStartTime;
    }

    @XmlElement(name = "PubInfoStartTime")
    public void setPubInfoStartTime(String pubInfoStartTime) {
        PubInfoStartTime = pubInfoStartTime;
    }

    public String getPubInfoEndTime() {
        return PubInfoEndTime;
    }

    @XmlElement(name = "PubInfoEndTime")
    public void setPubInfoEndTime(String pubInfoEndTime) {
        PubInfoEndTime = pubInfoEndTime;
    }
}
