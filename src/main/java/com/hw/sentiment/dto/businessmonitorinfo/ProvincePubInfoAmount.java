package com.hw.sentiment.dto.businessmonitorinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/3
 * @description 按省份统计的全国舆情数量信息区
 */
@XmlRootElement(name = "ProvincePubInfoAmount")
public class ProvincePubInfoAmount {
    private String PubInfoDepProvince;
    private String ProvinceInfoAmount;
    private List<ProvincePubInfoID> ProvincePubInfoIDArea;
    private List<ProvincePubInfoEmotion> ProvincePubInfoEmotionArea;
    private String PubInfoDepCityNum;
    private List<CityPubInfoAmount> CityPubInfoAmountArea;
    private String PubInfoWorkNum;
    private List<PubInfoWorkAmount> PubInfoWorkAmountArea;

    public String getPubInfoWorkNum() {
        return PubInfoWorkNum;
    }
    @XmlElement(name = "PubInfoWorkNum")
    public void setPubInfoWorkNum(String pubInfoWorkNum) {
        PubInfoWorkNum = pubInfoWorkNum;
    }

    public List<PubInfoWorkAmount> getPubInfoWorkAmountArea() {
        return PubInfoWorkAmountArea;
    }
    @XmlElement(name = "PubInfoWorkAmountArea")
    public void setPubInfoWorkAmountArea(List<PubInfoWorkAmount> pubInfoWorkAmountArea) {
        PubInfoWorkAmountArea = pubInfoWorkAmountArea;
    }

    public String getPubInfoDepProvince() {
        return PubInfoDepProvince;
    }
    @XmlElement(name = "PubInfoDepProvince")
    public void setPubInfoDepProvince(String pubInfoDepProvince) {
        PubInfoDepProvince = pubInfoDepProvince;
    }

    public String getProvinceInfoAmount() {
        return ProvinceInfoAmount;
    }
    @XmlElement(name = "ProvinceInfoAmount")
    public void setProvinceInfoAmount(String provinceInfoAmount) {
        ProvinceInfoAmount = provinceInfoAmount;
    }

    public List<ProvincePubInfoID> getProvincePubInfoIDArea() {
        return ProvincePubInfoIDArea;
    }
    @XmlElement(name = "ProvincePubInfoIDArea")
    public void setProvincePubInfoIDArea(List<ProvincePubInfoID> provincePubInfoIDArea) {
        ProvincePubInfoIDArea = provincePubInfoIDArea;
    }

    public List<ProvincePubInfoEmotion> getProvincePubInfoEmotionArea() {
        return ProvincePubInfoEmotionArea;
    }
    @XmlElement(name = "ProvincePubInfoEmotionArea")
    public void setProvincePubInfoEmotionArea(List<ProvincePubInfoEmotion> provincePubInfoEmotionArea) {
        ProvincePubInfoEmotionArea = provincePubInfoEmotionArea;
    }

    public String getPubInfoDepCityNum() {
        return PubInfoDepCityNum;
    }
    @XmlElement(name = "PubInfoDepCityNum")
    public void setPubInfoDepCityNum(String pubInfoDepCityNum) {
        PubInfoDepCityNum = pubInfoDepCityNum;
    }

    public List<CityPubInfoAmount> getCityPubInfoAmountArea() {
        return CityPubInfoAmountArea;
    }
    @XmlElement(name = "CityPubInfoAmountArea")
    public void setCityPubInfoAmountArea(List<CityPubInfoAmount> cityPubInfoAmountArea) {
        CityPubInfoAmountArea = cityPubInfoAmountArea;
    }
}
