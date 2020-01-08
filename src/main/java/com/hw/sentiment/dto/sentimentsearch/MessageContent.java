package com.hw.sentiment.dto.sentimentsearch;


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
    //司法案件舆情精准搜索服务订阅请求
    private String PubInfoSerialNum;
    private String PubInfoKeywordNum;
    private List<PubInfoKeywordArea> PubInfoKeywordArea;
    private String PubInfoCaseName;
    private String PubInfoCaseJudgeName;
    private String PlatCfgRslt;
    private String PlatInfoArea;

    public String getPlatInfoArea() {
        return PlatInfoArea;
    }
    @XmlElement(name = "PlatInfoArea")
    public void setPlatInfoArea(String platInfoArea) {
        PlatInfoArea = platInfoArea;
    }

    public String getPlatCfgRslt() {
        return PlatCfgRslt;
    }
    @XmlElement(name = "PlatCfgRslt")
    public void setPlatCfgRslt(String platCfgRslt) {
        PlatCfgRslt = platCfgRslt;
    }

    public String getPubInfoSerialNum() {
        return PubInfoSerialNum;
    }
    @XmlElement(name="PubInfoSerialNum")
    public void setPubInfoSerialNum(String PubInfoSerialNum) {
        this.PubInfoSerialNum = PubInfoSerialNum;
    }

    public String getPubInfoKeywordNum() {
        return PubInfoKeywordNum;
    }
    @XmlElement(name="PubInfoKeywordNum")
    public void setPubInfoKeywordNum(String PubInfoKeywordNum) {
        this.PubInfoKeywordNum = PubInfoKeywordNum;
    }

    public List<PubInfoKeywordArea> getPubInfoKeywordArea() {
        return PubInfoKeywordArea;
    }
    @XmlElement
    public void setPubInfoKeywordArea(List<PubInfoKeywordArea> PubInfoKeywordArea) {
       this.PubInfoKeywordArea = PubInfoKeywordArea;
    }

    public String getPubInfoCaseName() {
        return PubInfoCaseName;
    }
    @XmlElement(name="PubInfoCaseName")
    public void setPubInfoCaseName(String PubInfoCaseName) {
        this.PubInfoCaseName = PubInfoCaseName;
    }

    public String getPubInfoCaseJudgeName() {
        return PubInfoCaseJudgeName;
    }
    @XmlElement(name="PubInfoCaseJudgeName")
    public void setPubInfoCaseJudgeName(String PubInfoCaseJudgeName) {
        this.PubInfoCaseJudgeName = PubInfoCaseJudgeName;
    }


}
