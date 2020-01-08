package com.hw.sentiment.dto.businessmonitorinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/3
 * @description 按时间间隔统计的舆情数量信息区
 */
@XmlRootElement(name = "PubInfoIntervel")
public class PubInfoIntervel {
    private String CountryPubInfoStartTime;
    private String CountryPubInfoEndTime;
    private List<ProvinceIntervelAmount> ProvinceIntervelAmountArea;

    public String getCountryPubInfoStartTime() {
        return CountryPubInfoStartTime;
    }
    @XmlElement(name = "CountryPubInfoStartTime")
    public void setCountryPubInfoStartTime(String countryPubInfoStartTime) {
        CountryPubInfoStartTime = countryPubInfoStartTime;
    }

    public String getCountryPubInfoEndTime() {
        return CountryPubInfoEndTime;
    }
    @XmlElement(name = "CountryPubInfoEndTime")
    public void setCountryPubInfoEndTime(String countryPubInfoEndTime) {
        CountryPubInfoEndTime = countryPubInfoEndTime;
    }

    public List<ProvinceIntervelAmount> getProvinceIntervelAmountArea() {
        return ProvinceIntervelAmountArea;
    }
    @XmlElement(name = "ProvinceIntervelAmountArea")
    public void setProvinceIntervelAmountArea(List<ProvinceIntervelAmount> provinceIntervelAmountArea) {
        ProvinceIntervelAmountArea = provinceIntervelAmountArea;
    }
}

