package com.hw.sentiment.dto.businessmonitorinfo;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/3
 * @description 该类业务省份舆情发生数量信息区
 */
@XmlRootElement(name = "ProvincePubInfoWorkAmountArea")
public class ProvincePubInfoWorkAmountArea {
    private String PubInfoDepProvince;
    private String ProvinceInfoWorkAmount;
    private List<ProvincePubInfoWorkID> ProvincePubInfoWorkIDArea;
    private List<ProvincePubInfoWorkEmotion> ProvincePubInfoWorkEmotionArea;
    private String PubInfoDepCityNum;
    private List<CityPubInfoAmount> CityPubInfoWorkAmountArea;

    public String getPubInfoDepProvince() {
        return PubInfoDepProvince;
    }
    @XmlElement(name = "PubInfoDepProvince")
    public void setPubInfoDepProvince(String pubInfoDepProvince) {
        PubInfoDepProvince = pubInfoDepProvince;
    }

    public String getProvinceInfoWorkAmount() {
        return ProvinceInfoWorkAmount;
    }
    @XmlElement(name = "ProvinceInfoWorkAmount")
    public void setProvinceInfoWorkAmount(String provinceInfoWorkAmount) {
        ProvinceInfoWorkAmount = provinceInfoWorkAmount;
    }

    public List<ProvincePubInfoWorkID> getProvincePubInfoWorkIDArea() {
        return ProvincePubInfoWorkIDArea;
    }
    @XmlElement(name = "ProvincePubInfoWorkIDArea")
    public void setProvincePubInfoWorkIDArea(List<ProvincePubInfoWorkID> provincePubInfoWorkIDArea) {
        ProvincePubInfoWorkIDArea = provincePubInfoWorkIDArea;
    }

    public List<ProvincePubInfoWorkEmotion> getProvincePubInfoWorkEmotionArea() {
        return ProvincePubInfoWorkEmotionArea;
    }
    @XmlElement(name = "ProvincePubInfoWorkEmotionArea")
    public void setProvincePubInfoWorkEmotionArea(List<ProvincePubInfoWorkEmotion> provincePubInfoWorkEmotionArea) {
        ProvincePubInfoWorkEmotionArea = provincePubInfoWorkEmotionArea;
    }

    public String getPubInfoDepCityNum() {
        return PubInfoDepCityNum;
    }
    @XmlElement(name = "PubInfoDepCityNum")
    public void setPubInfoDepCityNum(String pubInfoDepCityNum) {
        PubInfoDepCityNum = pubInfoDepCityNum;
    }

    public List<CityPubInfoAmount> getCityPubInfoWorkAmountArea() {
        return CityPubInfoWorkAmountArea;
    }
    @XmlElement(name = "CityPubInfoWorkAmountArea")
    public void setCityPubInfoWorkAmountArea(List<CityPubInfoAmount> cityPubInfoWorkAmountArea) {
        CityPubInfoWorkAmountArea = cityPubInfoWorkAmountArea;
    }
}
