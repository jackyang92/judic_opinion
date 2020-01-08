package com.hw.sentiment.dto.businessmonitorinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/3
 * @description 描述信息
 */
@XmlRootElement(name = "ProvinceIntervelAmount")
public class ProvinceIntervelAmount {
    private String PubInfoDepProvince;
    private String ProvinceInfoAmount;
    private List<ProvincePubInfoID> ProvincePubInfoIDArea;
    private List<ProvincePubInfoEmotion> ProvincePubInfoEmotionArea;
    private String PubInfoDepCityNum;
    private List<CityIntervelAmount> CityIntervelAmountArea;

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

    public List<CityIntervelAmount> getCityIntervelAmountArea() {
        return CityIntervelAmountArea;
    }
    @XmlElement(name = "CityIntervelAmountArea")
    public void setCityIntervelAmountArea(List<CityIntervelAmount> cityIntervelAmountArea) {
        CityIntervelAmountArea = cityIntervelAmountArea;
    }
}
