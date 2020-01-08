package com.hw.sentiment.dto.businessmonitorinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/3
 * @description 全国舆情综合信息区
 */
@XmlRootElement(name = "PubInfoCountryStatic")
public class PubInfoCountryStatic {
    private String PubInfoCountryAmount;
    private List<PubInfoCountry> PubInfoCountryIDArea;
    private List<PubInfoCountryEmotion> PubInfoCountryEmotionArea;
    private String PubInfoWorkNum;
    private List<PubInfoWorkAmount> PubInfoWorkAmountArea;
    private String ProvinceNum;
    private List<ProvincePubInfoAmount> ProvincePubInfoAmountArea;
    private String PubInfoStartTime;
    private String PubInfoEndTime;
    private String PubInfoIntervelTime;
    private String IntervelTimeNum;
    private List<CountryPubInfoIntervel> CountryPubInfoIntervelArea;

    public String getPubInfoCountryAmount() {
        return PubInfoCountryAmount;
    }
    @XmlElement(name = "PubInfoCountryAmount")
    public void setPubInfoCountryAmount(String pubInfoCountryAmount) {
        PubInfoCountryAmount = pubInfoCountryAmount;
    }

    public List<PubInfoCountry> getPubInfoCountryIDArea() {
        return PubInfoCountryIDArea;
    }
    @XmlElement(name = "PubInfoCountryIDArea")
    public void setPubInfoCountryIDArea(List<PubInfoCountry> pubInfoCountryIDArea) {
        PubInfoCountryIDArea = pubInfoCountryIDArea;
    }

    public List<PubInfoCountryEmotion> getPubInfoCountryEmotionArea() {
        return PubInfoCountryEmotionArea;
    }
    @XmlElement(name = "PubInfoCountryEmotionArea")
    public void setPubInfoCountryEmotionArea(List<PubInfoCountryEmotion> pubInfoCountryEmotionArea) {
        PubInfoCountryEmotionArea = pubInfoCountryEmotionArea;
    }

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

    public String getProvinceNum() {
        return ProvinceNum;
    }
    @XmlElement(name = "ProvinceNum")
    public void setProvinceNum(String provinceNum) {
        ProvinceNum = provinceNum;
    }

    public List<ProvincePubInfoAmount> getProvincePubInfoAmountArea() {
        return ProvincePubInfoAmountArea;
    }
    @XmlElement(name = "ProvincePubInfoAmountArea")
    public void setProvincePubInfoAmountArea(List<ProvincePubInfoAmount> provincePubInfoAmountArea) {
        ProvincePubInfoAmountArea = provincePubInfoAmountArea;
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

    public String getPubInfoIntervelTime() {
        return PubInfoIntervelTime;
    }
    @XmlElement(name = "PubInfoIntervelTime")
    public void setPubInfoIntervelTime(String pubInfoIntervelTime) {
        PubInfoIntervelTime = pubInfoIntervelTime;
    }

    public String getIntervelTimeNum() {
        return IntervelTimeNum;
    }
    @XmlElement(name = "IntervelTimeNum")
    public void setIntervelTimeNum(String intervelTimeNum) {
        IntervelTimeNum = intervelTimeNum;
    }

    public List<CountryPubInfoIntervel> getCountryPubInfoIntervelArea() {
        return CountryPubInfoIntervelArea;
    }
    @XmlElement(name = "CountryPubInfoIntervelArea")
    public void setCountryPubInfoIntervelArea(List<CountryPubInfoIntervel> countryPubInfoIntervelArea) {
        CountryPubInfoIntervelArea = countryPubInfoIntervelArea;
    }
}
