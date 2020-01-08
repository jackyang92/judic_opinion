package com.hw.sentiment.dto.businessmonitorinfo;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/2
 * @description 报文内容
 */
@XmlRootElement(name="MessageContent")
public class MessageContent {
    //业务监测信息请求
    private String PubInfoStartTime;
    private String PubInfoEndTime;
    private String PubInfoStaticType;
    private String PubInfoDepartmentType;
    private String PubInfoDepartmentLevel;
    private String PubInfoDepProvince;
    private String PubInfoDepCity;
    //业务监测信息应答
    private String PlatCfgRslt;
    private String PlatInfoArea;
    private List<PubInfoCountryStatic> PubInfoCountryStaticArea;
    private List<PubInfoProvinceStatic> PubInfoProvinceStaticArea;
    private List<PubInfoCityStatic> PubInfoCityStaticArea;

    public String getPlatCfgRslt() {
        return PlatCfgRslt;
    }
    @XmlElement(name="PlatCfgRslt")
    public void setPlatCfgRslt(String platCfgRslt) {
        PlatCfgRslt = platCfgRslt;
    }

    public String getPlatInfoArea() {
        return PlatInfoArea;
    }
    @XmlElement(name="PlatInfoArea")
    public void setPlatInfoArea(String platInfoArea) {
        PlatInfoArea = platInfoArea;
    }

    public List<PubInfoCountryStatic> getPubInfoCountryStaticArea() {
        return PubInfoCountryStaticArea;
    }
    @XmlElement(name="PubInfoCountryStaticArea")
    public void setPubInfoCountryStaticArea(List<PubInfoCountryStatic> pubInfoCountryStaticArea) {
        PubInfoCountryStaticArea = pubInfoCountryStaticArea;
    }

    public List<PubInfoProvinceStatic> getPubInfoProvinceStaticArea() {
        return PubInfoProvinceStaticArea;
    }
    @XmlElement(name="PubInfoProvinceStaticArea")
    public void setPubInfoProvinceStaticArea(List<PubInfoProvinceStatic> pubInfoProvinceStaticArea) {
        PubInfoProvinceStaticArea = pubInfoProvinceStaticArea;
    }

    public List<PubInfoCityStatic> getPubInfoCityStaticArea() {
        return PubInfoCityStaticArea;
    }
    @XmlElement(name="PubInfoCityStaticArea")
    public void setPubInfoCityStaticArea(List<PubInfoCityStatic> pubInfoCityStaticArea) {
        PubInfoCityStaticArea = pubInfoCityStaticArea;
    }

    public String getPubInfoStartTime() {
        return PubInfoStartTime;
    }
    @XmlElement(name="PubInfoStartTime")
    public void setPubInfoStartTime(String pubInfoStartTime) {
        PubInfoStartTime = pubInfoStartTime;
    }

    public String getPubInfoEndTime() {
        return PubInfoEndTime;
    }
    @XmlElement(name="PubInfoEndTime")
    public void setPubInfoEndTime(String pubInfoEndTime) {
        PubInfoEndTime = pubInfoEndTime;
    }

    public String getPubInfoStaticType() {
        return PubInfoStaticType;
    }
    @XmlElement(name="PubInfoStaticType")
    public void setPubInfoStaticType(String pubInfoStaticType) {
        PubInfoStaticType = pubInfoStaticType;
    }

    public String getPubInfoDepartmentType() {
        return PubInfoDepartmentType;
    }
    @XmlElement(name="PubInfoDepartmentType")
    public void setPubInfoDepartmentType(String pubInfoDepartmentType) {
        PubInfoDepartmentType = pubInfoDepartmentType;
    }

    public String getPubInfoDepartmentLevel() {
        return PubInfoDepartmentLevel;
    }
    @XmlElement(name="PubInfoDepartmentLevel")
    public void setPubInfoDepartmentLevel(String pubInfoDepartmentLevel) {
        PubInfoDepartmentLevel = pubInfoDepartmentLevel;
    }

    public String getPubInfoDepProvince() {
        return PubInfoDepProvince;
    }
    @XmlElement(name="PubInfoDepProvince")
    public void setPubInfoDepProvince(String pubInfoDepProvince) {
        PubInfoDepProvince = pubInfoDepProvince;
    }

    public String getPubInfoDepCity() {
        return PubInfoDepCity;
    }
    @XmlElement(name="PubInfoDepCity")
    public void setPubInfoDepCity(String pubInfoDepCity) {
        PubInfoDepCity = pubInfoDepCity;
    }


}
