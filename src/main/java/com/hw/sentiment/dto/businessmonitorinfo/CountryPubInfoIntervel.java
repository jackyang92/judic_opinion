package com.hw.sentiment.dto.businessmonitorinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/3
 * @description 按时间间隔统计的全国舆情数量信息区
 */
@XmlRootElement(name = "CountryPubInfoIntervel")
public class CountryPubInfoIntervel {
    private String CountryPubInfoStartTime;
    private String CountryPubInfoEndTime;
    private String CountryPubInfoIntervelAllNum;
    private List<PubInfoCountryIDarea> PubInfoCountryIDarea;
    private List<PubInfoCountryEmotionArea> PubInfoCountryEmotionArea;
    private String ProvinceNum;
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

    public String getCountryPubInfoIntervelAllNum() {
        return CountryPubInfoIntervelAllNum;
    }
    @XmlElement(name = "CountryPubInfoIntervelAllNum")
    public void setCountryPubInfoIntervelAllNum(String countryPubInfoIntervelAllNum) {
        CountryPubInfoIntervelAllNum = countryPubInfoIntervelAllNum;
    }

    public List<PubInfoCountryIDarea> getPubInfoCountryIDarea() {
        return PubInfoCountryIDarea;
    }
    @XmlElement(name = "PubInfoCountryIDarea")
    public void setPubInfoCountryIDarea(List<PubInfoCountryIDarea> pubInfoCountryIDarea) {
        PubInfoCountryIDarea = pubInfoCountryIDarea;
    }

    public List<PubInfoCountryEmotionArea> getPubInfoCountryEmotionArea() {
        return PubInfoCountryEmotionArea;
    }
    @XmlElement(name = "PubInfoCountryEmotionArea")
    public void setPubInfoCountryEmotionArea(List<PubInfoCountryEmotionArea> pubInfoCountryEmotionArea) {
        PubInfoCountryEmotionArea = pubInfoCountryEmotionArea;
    }

    public String getProvinceNum() {
        return ProvinceNum;
    }
    @XmlElement(name = "ProvinceNum")
    public void setProvinceNum(String provinceNum) {
        ProvinceNum = provinceNum;
    }

    public List<ProvinceIntervelAmount> getProvinceIntervelAmountArea() {
        return ProvinceIntervelAmountArea;
    }
    @XmlElement(name = "ProvinceIntervelAmountArea")
    public void setProvinceIntervelAmountArea(List<ProvinceIntervelAmount> provinceIntervelAmountArea) {
        ProvinceIntervelAmountArea = provinceIntervelAmountArea;
    }
}
