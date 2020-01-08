package com.hw.sentiment.dto.businessmonitorinfo;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/3
 * @description 省份舆情综合监测信息区
 */
@XmlRootElement(name = "PubInfoProvinceStatic")
public class PubInfoProvinceStatic {
    private List<ProvincePubInfoAmount> ProvincePubInfoAmountArea;
    private String PubInfoStartTime;
    private String PubInfoEndTime;
    private String PubInfoIntervelTime;
    private String IntervelTimeNum;
    private List<PubInfoIntervel> PubInfoIntervelArea;

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

    public List<PubInfoIntervel> getPubInfoIntervelArea() {
        return PubInfoIntervelArea;
    }
    @XmlElement(name = "PubInfoIntervelArea")
    public void setPubInfoIntervelArea(List<PubInfoIntervel> pubInfoIntervelArea) {
        PubInfoIntervelArea = pubInfoIntervelArea;
    }
}
