package com.hw.sentiment.dto.businessmonitorinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/3
 * @description 该类业务地市舆情数量信息
 */
@XmlRootElement(name = "CityPubInfoAmount")
public class CityPubInfoAmount {
    private String PubInfoDepCity;
    private String CityInfoworkAmount;
    private List<CityPubInfoWorkID> CityPubInfoWorkIDArea;
    private List<CityPubInfoWorkEmotion> CityPubInfoWorkEmotionArea;
    private String CityInfoAmount;
    private List<CityPubInfoID> CityPubInfoIDArea;
    private List<CityPubInfokEmotion> CityPubInfoEmotionArea;
    /*private List<CityPubInfoID> CityPubInfoWorkIDArea;
    private List<CityPubInfokEmotion> CityPubInfoWorkEmotionArea;*/

    public String getCityInfoAmount() {
        return CityInfoAmount;
    }
    @XmlElement(name = "CityInfoAmount")
    public void setCityInfoAmount(String cityInfoAmount) {
        CityInfoAmount = cityInfoAmount;
    }

    public List<CityPubInfoID> getCityPubInfoIDArea() {
        return CityPubInfoIDArea;
    }
    @XmlElement(name = "CityPubInfoIDArea")
    public void setCityPubInfoIDArea(List<CityPubInfoID> cityPubInfoIDArea) {
        CityPubInfoIDArea = cityPubInfoIDArea;
    }

    public List<CityPubInfokEmotion> getCityPubInfoEmotionArea() {
        return CityPubInfoEmotionArea;
    }
    @XmlElement(name = "CityPubInfoEmotionArea")
    public void setCityPubInfoEmotionArea(List<CityPubInfokEmotion> cityPubInfoEmotionArea) {
        CityPubInfoEmotionArea = cityPubInfoEmotionArea;
    }

    public String getPubInfoDepCity() {
        return PubInfoDepCity;
    }
    @XmlElement(name = "PubInfoDepCity")
    public void setPubInfoDepCity(String pubInfoDepCity) {
        PubInfoDepCity = pubInfoDepCity;
    }

    public String getCityInfoworkAmount() {
        return CityInfoworkAmount;
    }
    @XmlElement(name = "CityInfoworkAmount")
    public void setCityInfoworkAmount(String cityInfoworkAmount) {
        CityInfoworkAmount = cityInfoworkAmount;
    }

    public List<CityPubInfoWorkID> getCityPubInfoWorkIDArea() {
        return CityPubInfoWorkIDArea;
    }
    @XmlElement(name = "CityPubInfoWorkIDArea")
    public void setCityPubInfoWorkIDArea(List<CityPubInfoWorkID> cityPubInfoWorkIDArea) {
        CityPubInfoWorkIDArea = cityPubInfoWorkIDArea;
    }

    public List<CityPubInfoWorkEmotion> getCityPubInfoWorkEmotionArea() {
        return CityPubInfoWorkEmotionArea;
    }
    @XmlElement(name = "CityPubInfoWorkEmotionArea")
    public void setCityPubInfoWorkEmotionArea(List<CityPubInfoWorkEmotion> cityPubInfoWorkEmotionArea) {
        CityPubInfoWorkEmotionArea = cityPubInfoWorkEmotionArea;
    }
}
