package com.hw.sentiment.dto.businessmonitorinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/3
 * @description 描述信息
 */
@XmlRootElement(name = "CityIntervelAmount")
public class CityIntervelAmount {
    private String PubInfoDepCity;
    private String CityInfoAmount;
    private List<CityPubInfoID> CityPubInfoIDArea;
    private List<CityPubInfokEmotion> CityPubInfoEmotionArea;

    public String getPubInfoDepCity() {
        return PubInfoDepCity;
    }
    @XmlElement(name = "PubInfoDepCity")
    public void setPubInfoDepCity(String pubInfoDepCity) {
        PubInfoDepCity = pubInfoDepCity;
    }

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
}
