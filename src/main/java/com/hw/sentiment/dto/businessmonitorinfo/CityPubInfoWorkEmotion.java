package com.hw.sentiment.dto.businessmonitorinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/3
 * @description 该类业务按情感统计的地市舆情信息区
 */
@XmlRootElement(name = "CityPubInfoWorkEmotion")
public class CityPubInfoWorkEmotion {
    private String PubInfoPositiveAmount;
    private List<PubInfoPositiveID> PubInfoPositiveIDArea;
    private String PubInfoNegativeAmount;
    private List<PubInfoNegativeID> PubInfoNegativeIDArea;
    private String PubInfoNeutralAmount;
    private List<PubInfoNeutralID> PubInfoNeutralIDArea;

    public String getPubInfoPositiveAmount() {
        return PubInfoPositiveAmount;
    }
    @XmlElement(name = "PubInfoPositiveAmount")
    public void setPubInfoPositiveAmount(String pubInfoPositiveAmount) {
        PubInfoPositiveAmount = pubInfoPositiveAmount;
    }

    public List<PubInfoPositiveID> getPubInfoPositiveIDArea() {
        return PubInfoPositiveIDArea;
    }
    @XmlElement(name = "PubInfoPositiveIDArea")
    public void setPubInfoPositiveIDArea(List<PubInfoPositiveID> pubInfoPositiveIDArea) {
        PubInfoPositiveIDArea = pubInfoPositiveIDArea;
    }

    public String getPubInfoNegativeAmount() {
        return PubInfoNegativeAmount;
    }
    @XmlElement(name = "PubInfoNegativeAmount")
    public void setPubInfoNegativeAmount(String pubInfoNegativeAmount) {
        PubInfoNegativeAmount = pubInfoNegativeAmount;
    }

    public List<PubInfoNegativeID> getPubInfoNegativeIDArea() {
        return PubInfoNegativeIDArea;
    }
    @XmlElement(name = "PubInfoNegativeIDArea")
    public void setPubInfoNegativeIDArea(List<PubInfoNegativeID> pubInfoNegativeIDArea) {
        PubInfoNegativeIDArea = pubInfoNegativeIDArea;
    }

    public String getPubInfoNeutralAmount() {
        return PubInfoNeutralAmount;
    }
    @XmlElement(name = "PubInfoNeutralAmount")
    public void setPubInfoNeutralAmount(String pubInfoNeutralAmount) {
        PubInfoNeutralAmount = pubInfoNeutralAmount;
    }

    public List<PubInfoNeutralID> getPubInfoNeutralIDArea() {
        return PubInfoNeutralIDArea;
    }
    @XmlElement(name = "PubInfoNeutralIDArea")
    public void setPubInfoNeutralIDArea(List<PubInfoNeutralID> pubInfoNeutralIDArea) {
        PubInfoNeutralIDArea = pubInfoNeutralIDArea;
    }
}

