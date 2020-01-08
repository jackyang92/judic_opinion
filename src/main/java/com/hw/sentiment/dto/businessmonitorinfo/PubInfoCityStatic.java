package com.hw.sentiment.dto.businessmonitorinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/3
 * @description 地市舆情综合监测信息区
 */
@XmlRootElement(name = "PubInfoCityStatic")
public class PubInfoCityStatic {
    private List<CityPubInfoAmount> CityPubInfoAmountArea;
    private String PubInfoWorkNum;
    private List<PubInfoWorkAmount> PubInfoWorkAmountArea;
    private String PubInfoStartTime;
    private String PubInfoEndTime;
    private String PubInfoIntervelTime;
    private String IntervelTimeNum;
    private List<PubInfoIntervel> PubInfoIntervelArea;

    public List<CityPubInfoAmount> getCityPubInfoAmountArea() {
        return CityPubInfoAmountArea;
    }
    @XmlElement(name = "CityPubInfoAmountArea")
    public void setCityPubInfoAmountArea(List<CityPubInfoAmount> cityPubInfoAmountArea) {
        CityPubInfoAmountArea = cityPubInfoAmountArea;
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

    public List<PubInfoIntervel> getPubInfoIntervelArea() {
        return PubInfoIntervelArea;
    }
    @XmlElement(name = "PubInfoIntervelArea")
    public void setPubInfoIntervelArea(List<PubInfoIntervel> pubInfoIntervelArea) {
        PubInfoIntervelArea = pubInfoIntervelArea;
    }
}
