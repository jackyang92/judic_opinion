package com.hw.sentiment.dto.hottopicmonitoringinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/4
 * @description 描述信息
 */
@XmlRootElement(name = "PubInfoTopicNetizen")
public class PubInfoTopicNetizen {
    private String NetizenName;
    private String NetizeTypen;
    private String NetizeSourceType;
    private String NetizeSourceName;
    private String NetizeNetPostNum;
    private List<NetizeNetPostInfoLink> NetizeNetPostInfoLinkArea;
    private String NetizeBeforwardNetPostNum;

    public String getNetizenName() {
        return NetizenName;
    }
    @XmlElement(name = "NetizenName")
    public void setNetizenName(String netizenName) {
        NetizenName = netizenName;
    }

    public String getNetizeTypen() {
        return NetizeTypen;
    }
    @XmlElement(name = "NetizeTypen")
    public void setNetizeTypen(String netizeTypen) {
        NetizeTypen = netizeTypen;
    }

    public String getNetizeSourceType() {
        return NetizeSourceType;
    }
    @XmlElement(name = "NetizeSourceType")
    public void setNetizeSourceType(String netizeSourceType) {
        NetizeSourceType = netizeSourceType;
    }

    public String getNetizeSourceName() {
        return NetizeSourceName;
    }
    @XmlElement(name = "NetizeSourceName")
    public void setNetizeSourceName(String netizeSourceName) {
        NetizeSourceName = netizeSourceName;
    }

    public String getNetizeNetPostNum() {
        return NetizeNetPostNum;
    }
    @XmlElement(name = "NetizeNetPostNum")
    public void setNetizeNetPostNum(String netizeNetPostNum) {
        NetizeNetPostNum = netizeNetPostNum;
    }

    public List<NetizeNetPostInfoLink> getNetizeNetPostInfoLinkArea() {
        return NetizeNetPostInfoLinkArea;
    }
    @XmlElement(name = "NetizeNetPostInfoLinkArea")
    public void setNetizeNetPostInfoLinkArea(List<NetizeNetPostInfoLink> netizeNetPostInfoLinkArea) {
        NetizeNetPostInfoLinkArea = netizeNetPostInfoLinkArea;
    }

    public String getNetizeBeforwardNetPostNum() {
        return NetizeBeforwardNetPostNum;
    }
    @XmlElement(name = "NetizeBeforwardNetPostNum")
    public void setNetizeBeforwardNetPostNum(String netizeBeforwardNetPostNum) {
        NetizeBeforwardNetPostNum = netizeBeforwardNetPostNum;
    }
}

