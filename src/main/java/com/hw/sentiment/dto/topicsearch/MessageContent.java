package com.hw.sentiment.dto.topicsearch;


import com.hw.sentiment.dto.sentimentsearch.PubInfoKeywordArea;

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
    private String PubInfoSearchType;
    private String TimeSearchFlag;
    private String KeySearchFlag;
    private String RegionSearchFlag;
    private String DepartmentSearchFlag;
    private String WorkSearchFlag;
    private String PubInfoStartTime;
    private String PubInfoEndTime;
    private String PubInfoKeywordNum;
    private List<PubInfoKeyword> PubInfoKeywordArea;
    private String PubInfoTopicSourceRegion;
    private String PubInfoDepartmentLevel;
    private String PubInfoDepProvince;
    private String PubInfoDepCity;
    private String PubInfoTopicJusticeType;
    //应答
    private String PlatCfgRslt;
    private String PlatInfoArea;
    private String PubInfoTopicNum;
    private String PubInfoTopicArea;

    public String getPlatCfgRslt() {
        return PlatCfgRslt;
    }
    @XmlElement(name = "PlatCfgRslt")
    public void setPlatCfgRslt(String platCfgRslt) {
        PlatCfgRslt = platCfgRslt;
    }

    public String getPlatInfoArea() {
        return PlatInfoArea;
    }
    @XmlElement(name = "PlatInfoArea")
    public void setPlatInfoArea(String platInfoArea) {
        PlatInfoArea = platInfoArea;
    }

    public String getPubInfoTopicNum() {
        return PubInfoTopicNum;
    }
    @XmlElement(name = "PubInfoTopicNum")
    public void setPubInfoTopicNum(String pubInfoTopicNum) {
        PubInfoTopicNum = pubInfoTopicNum;
    }

    public String getPubInfoTopicArea() {
        return PubInfoTopicArea;
    }
    @XmlElement(name = "PubInfoTopicArea")
    public void setPubInfoTopicArea(String pubInfoTopicArea) {
        PubInfoTopicArea = pubInfoTopicArea;
    }

    public String getPubInfoSearchType() {
        return PubInfoSearchType;
    }
    @XmlElement(name = "PubInfoSearchType")
    public void setPubInfoSearchType(String pubInfoSearchType) {
        PubInfoSearchType = pubInfoSearchType;
    }

    public String getTimeSearchFlag() {
        return TimeSearchFlag;
    }
    @XmlElement(name = "TimeSearchFlag")
    public void setTimeSearchFlag(String timeSearchFlag) {
        TimeSearchFlag = timeSearchFlag;
    }

    public String getKeySearchFlag() {
        return KeySearchFlag;
    }
    @XmlElement(name = "KeySearchFlag")
    public void setKeySearchFlag(String keySearchFlag) {
        KeySearchFlag = keySearchFlag;
    }

    public String getRegionSearchFlag() {
        return RegionSearchFlag;
    }
    @XmlElement(name = "RegionSearchFlag")
    public void setRegionSearchFlag(String regionSearchFlag) {
        RegionSearchFlag = regionSearchFlag;
    }

    public String getDepartmentSearchFlag() {
        return DepartmentSearchFlag;
    }
    @XmlElement(name = "DepartmentSearchFlag")
    public void setDepartmentSearchFlag(String departmentSearchFlag) {
        DepartmentSearchFlag = departmentSearchFlag;
    }

    public String getWorkSearchFlag() {
        return WorkSearchFlag;
    }
    @XmlElement(name = "WorkSearchFlag")
    public void setWorkSearchFlag(String workSearchFlag) {
        WorkSearchFlag = workSearchFlag;
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

    public String getPubInfoKeywordNum() {
        return PubInfoKeywordNum;
    }
    @XmlElement(name = "PubInfoKeywordNum")
    public void setPubInfoKeywordNum(String pubInfoKeywordNum) {
        PubInfoKeywordNum = pubInfoKeywordNum;
    }

    public List<PubInfoKeyword> getPubInfoKeywordArea() {
        return PubInfoKeywordArea;
    }
    @XmlElement(name = "PubInfoKeywordArea")
    public void setPubInfoKeywordArea(List<PubInfoKeyword> pubInfoKeywordArea) {
        PubInfoKeywordArea = pubInfoKeywordArea;
    }

    public String getPubInfoTopicSourceRegion() {
        return PubInfoTopicSourceRegion;
    }
    @XmlElement(name = "PubInfoTopicSourceRegion")
    public void setPubInfoTopicSourceRegion(String pubInfoTopicSourceRegion) {
        PubInfoTopicSourceRegion = pubInfoTopicSourceRegion;
    }

    public String getPubInfoDepartmentLevel() {
        return PubInfoDepartmentLevel;
    }
    @XmlElement(name = "PubInfoDepartmentLevel")
    public void setPubInfoDepartmentLevel(String pubInfoDepartmentLevel) {
        PubInfoDepartmentLevel = pubInfoDepartmentLevel;
    }

    public String getPubInfoDepProvince() {
        return PubInfoDepProvince;
    }
    @XmlElement(name = "PubInfoDepProvince")
    public void setPubInfoDepProvince(String pubInfoDepProvince) {
        PubInfoDepProvince = pubInfoDepProvince;
    }

    public String getPubInfoDepCity() {
        return PubInfoDepCity;
    }
    @XmlElement(name = "PubInfoDepCity")
    public void setPubInfoDepCity(String pubInfoDepCity) {
        PubInfoDepCity = pubInfoDepCity;
    }

    public String getPubInfoTopicJusticeType() {
        return PubInfoTopicJusticeType;
    }
    @XmlElement(name = "PubInfoTopicJusticeType")
    public void setPubInfoTopicJusticeType(String pubInfoTopicJusticeType) {
        PubInfoTopicJusticeType = pubInfoTopicJusticeType;
    }
}


