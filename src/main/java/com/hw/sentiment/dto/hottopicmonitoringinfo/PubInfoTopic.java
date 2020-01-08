package com.hw.sentiment.dto.hottopicmonitoringinfo;


import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2019/12/26
 * @description 舆情热点话题监测信息--热点话题信息区
 */
@XmlRootElement(name = "PubInfoTopic")
public class PubInfoTopic {
   private String  PubInfoTopicID;
   private String  PubInfoTopicTitle;
   private String PubInfoTopicContent;
   private String PubInfoTopicAbstract;
   private String PubInfoTopicStartTime;
   private String PubInfoTopicEndTime;
   private String PubInfoTopicSourceRegion;
   private String PubInfoTopicSourceStartTime;
   private String PubInfoTopicSourceType;
   private String PubInfoTopicSourceStationName;
   private String PubInfoTopicSourceNetizenName;
   private String PubInfoTopicNetPostNum;
   private String PubInfoTopicNetPostPeakTime;
   private String PubInfoTopicNetizenNum;
   //热点网民
   private List<PubInfoTopicNetizen> PubInfoTopicNetizenArea;
   private String PubInfoTopicJusticeType;
   private String PubInfoTopicHeatNum;
   private String PubInfoTopicInitiatorInfluence;
   private String PubInfoTopicPeriodNum;
   //舆情热点话题时间段信息区
   private List<PubInfoTopicPeriod> PubInfoTopicPeriodArea;
   private String PubInfoTopicKeaywordNum;
   //舆情热点话题关键词信息区
   private List<PubInfoTopicKeayword> PubInfoTopicKeaywordArea;
   private String PubInfoTopicViewpointNum;
   //舆情热点话题观点信息区
   private List<PubInfoTopicViewpointInfo> PubInfoTopicViewpointInfoArea;
   private String PubInfoTopicEmotion;
   private String PubInfoDepartmentType;
   private String PubInfoDepartmentLevel;
   private String PubInfoDepProvince;
   private String PubInfoDepCity;
   private String PubInfoFileNum;
   //舆情热点话题附件信息区
   private List<PubInfoFile> PubInfoFileArea;
   private String PubInfoTopicEventNum;
   //舆情热点话题包含的舆情事件标识信息区
   private List<PubInfoTopicEventID> PubInfoTopicEventIDArea;

   public String getPubInfoTopicID() {
      return PubInfoTopicID;
   }
   @XmlElement(name = "PubInfoTopicID")
   public void setPubInfoTopicID(String pubInfoTopicID) {
      PubInfoTopicID = pubInfoTopicID;
   }

   public String getPubInfoTopicTitle() {
      return PubInfoTopicTitle;
   }
   @XmlElement(name = "PubInfoTopicTitle")
   public void setPubInfoTopicTitle(String pubInfoTopicTitle) {
      PubInfoTopicTitle = pubInfoTopicTitle;
   }

   public String getPubInfoTopicContent() {
      return PubInfoTopicContent;
   }
   @XmlElement(name = "PubInfoTopicContent")
   public void setPubInfoTopicContent(String pubInfoTopicContent) {
      PubInfoTopicContent = pubInfoTopicContent;
   }

   public String getPubInfoTopicAbstract() {
      return PubInfoTopicAbstract;
   }
   @XmlElement(name = "PubInfoTopicAbstract")
   public void setPubInfoTopicAbstract(String pubInfoTopicAbstract) {
      PubInfoTopicAbstract = pubInfoTopicAbstract;
   }

   public String getPubInfoTopicStartTime() {
      return PubInfoTopicStartTime;
   }
   @XmlElement(name = "PubInfoTopicStartTime")
   public void setPubInfoTopicStartTime(String pubInfoTopicStartTime) {
      PubInfoTopicStartTime = pubInfoTopicStartTime;
   }

   public String getPubInfoTopicEndTime() {
      return PubInfoTopicEndTime;
   }
   @XmlElement(name = "PubInfoTopicEndTime")
   public void setPubInfoTopicEndTime(String pubInfoTopicEndTime) {
      PubInfoTopicEndTime = pubInfoTopicEndTime;
   }

   public String getPubInfoTopicSourceRegion() {
      return PubInfoTopicSourceRegion;
   }
   @XmlElement(name = "PubInfoTopicSourceRegion")
   public void setPubInfoTopicSourceRegion(String pubInfoTopicSourceRegion) {
      PubInfoTopicSourceRegion = pubInfoTopicSourceRegion;
   }

   public String getPubInfoTopicSourceStartTime() {
      return PubInfoTopicSourceStartTime;
   }
   @XmlElement(name = "PubInfoTopicSourceStartTime")
   public void setPubInfoTopicSourceStartTime(String pubInfoTopicSourceStartTime) {
      PubInfoTopicSourceStartTime = pubInfoTopicSourceStartTime;
   }

   public String getPubInfoTopicSourceType() {
      return PubInfoTopicSourceType;
   }
   @XmlElement(name = "PubInfoTopicSourceType")
   public void setPubInfoTopicSourceType(String pubInfoTopicSourceType) {
      PubInfoTopicSourceType = pubInfoTopicSourceType;
   }

   public String getPubInfoTopicSourceStationName() {
      return PubInfoTopicSourceStationName;
   }
   @XmlElement(name = "PubInfoTopicSourceStationName")
   public void setPubInfoTopicSourceStationName(String pubInfoTopicSourceStationName) {
      PubInfoTopicSourceStationName = pubInfoTopicSourceStationName;
   }

   public String getPubInfoTopicSourceNetizenName() {
      return PubInfoTopicSourceNetizenName;
   }
   @XmlElement(name = "PubInfoTopicSourceNetizenName")
   public void setPubInfoTopicSourceNetizenName(String pubInfoTopicSourceNetizenName) {
      PubInfoTopicSourceNetizenName = pubInfoTopicSourceNetizenName;
   }

   public String getPubInfoTopicNetPostNum() {
      return PubInfoTopicNetPostNum;
   }
   @XmlElement(name = "PubInfoTopicNetPostNum")
   public void setPubInfoTopicNetPostNum(String pubInfoTopicNetPostNum) {
      PubInfoTopicNetPostNum = pubInfoTopicNetPostNum;
   }

   public String getPubInfoTopicNetPostPeakTime() {
      return PubInfoTopicNetPostPeakTime;
   }
   @XmlElement(name = "PubInfoTopicNetPostPeakTime")
   public void setPubInfoTopicNetPostPeakTime(String pubInfoTopicNetPostPeakTime) {
      PubInfoTopicNetPostPeakTime = pubInfoTopicNetPostPeakTime;
   }

   public String getPubInfoTopicNetizenNum() {
      return PubInfoTopicNetizenNum;
   }
   @XmlElement(name = "PubInfoTopicNetizenNum")
   public void setPubInfoTopicNetizenNum(String pubInfoTopicNetizenNum) {
      PubInfoTopicNetizenNum = pubInfoTopicNetizenNum;
   }

   public List<PubInfoTopicNetizen> getPubInfoTopicNetizenArea() {
      return PubInfoTopicNetizenArea;
   }
   @XmlElement(name = "PubInfoTopicNetizenArea")
   public void setPubInfoTopicNetizenArea(List<PubInfoTopicNetizen> pubInfoTopicNetizenArea) {
      PubInfoTopicNetizenArea = pubInfoTopicNetizenArea;
   }

   public String getPubInfoTopicJusticeType() {
      return PubInfoTopicJusticeType;
   }
   @XmlElement(name = "PubInfoTopicJusticeType")
   public void setPubInfoTopicJusticeType(String pubInfoTopicJusticeType) {
      PubInfoTopicJusticeType = pubInfoTopicJusticeType;
   }

   public String getPubInfoTopicHeatNum() {
      return PubInfoTopicHeatNum;
   }
   @XmlElement(name = "PubInfoTopicHeatNum")
   public void setPubInfoTopicHeatNum(String pubInfoTopicHeatNum) {
      PubInfoTopicHeatNum = pubInfoTopicHeatNum;
   }

   public String getPubInfoTopicInitiatorInfluence() {
      return PubInfoTopicInitiatorInfluence;
   }
   @XmlElement(name = "PubInfoTopicInitiatorInfluence")
   public void setPubInfoTopicInitiatorInfluence(String pubInfoTopicInitiatorInfluence) {
      PubInfoTopicInitiatorInfluence = pubInfoTopicInitiatorInfluence;
   }

   public String getPubInfoTopicPeriodNum() {
      return PubInfoTopicPeriodNum;
   }
   @XmlElement(name = "PubInfoTopicPeriodNum")
   public void setPubInfoTopicPeriodNum(String pubInfoTopicPeriodNum) {
      PubInfoTopicPeriodNum = pubInfoTopicPeriodNum;
   }

   public List<PubInfoTopicPeriod> getPubInfoTopicPeriodArea() {
      return PubInfoTopicPeriodArea;
   }
   @XmlElement(name = "PubInfoTopicPeriodArea")
   public void setPubInfoTopicPeriodArea(List<PubInfoTopicPeriod> pubInfoTopicPeriodArea) {
      PubInfoTopicPeriodArea = pubInfoTopicPeriodArea;
   }

   public String getPubInfoTopicKeaywordNum() {
      return PubInfoTopicKeaywordNum;
   }
   @XmlElement(name = "PubInfoTopicKeaywordNum")
   public void setPubInfoTopicKeaywordNum(String pubInfoTopicKeaywordNum) {
      PubInfoTopicKeaywordNum = pubInfoTopicKeaywordNum;
   }

   public List<PubInfoTopicKeayword> getPubInfoTopicKeaywordArea() {
      return PubInfoTopicKeaywordArea;
   }
   @XmlElement(name = "PubInfoTopicKeaywordArea")
   public void setPubInfoTopicKeaywordArea(List<PubInfoTopicKeayword> pubInfoTopicKeaywordArea) {
      PubInfoTopicKeaywordArea = pubInfoTopicKeaywordArea;
   }

   public String getPubInfoTopicViewpointNum() {
      return PubInfoTopicViewpointNum;
   }
   @XmlElement(name = "PubInfoTopicViewpointNum")
   public void setPubInfoTopicViewpointNum(String pubInfoTopicViewpointNum) {
      PubInfoTopicViewpointNum = pubInfoTopicViewpointNum;
   }

   public List<PubInfoTopicViewpointInfo> getPubInfoTopicViewpointInfoArea() {
      return PubInfoTopicViewpointInfoArea;
   }
   @XmlElement(name = "PubInfoTopicViewpointInfoArea")
   public void setPubInfoTopicViewpointInfoArea(List<PubInfoTopicViewpointInfo> pubInfoTopicViewpointInfoArea) {
      PubInfoTopicViewpointInfoArea = pubInfoTopicViewpointInfoArea;
   }

   public String getPubInfoTopicEmotion() {
      return PubInfoTopicEmotion;
   }
   @XmlElement(name = "PubInfoTopicEmotion")
   public void setPubInfoTopicEmotion(String pubInfoTopicEmotion) {
      PubInfoTopicEmotion = pubInfoTopicEmotion;
   }

   public String getPubInfoDepartmentType() {
      return PubInfoDepartmentType;
   }
   @XmlElement(name = "PubInfoDepartmentType")
   public void setPubInfoDepartmentType(String pubInfoDepartmentType) {
      PubInfoDepartmentType = pubInfoDepartmentType;
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

   public String getPubInfoFileNum() {
      return PubInfoFileNum;
   }
   @XmlElement(name = "PubInfoFileNum")
   public void setPubInfoFileNum(String pubInfoFileNum) {
      PubInfoFileNum = pubInfoFileNum;
   }

   public List<PubInfoFile> getPubInfoFileArea() {
      return PubInfoFileArea;
   }
   @XmlElement(name = "PubInfoFileArea")
   public void setPubInfoFileArea(List<PubInfoFile> pubInfoFileArea) {
      PubInfoFileArea = pubInfoFileArea;
   }

   public String getPubInfoTopicEventNum() {
      return PubInfoTopicEventNum;
   }
   @XmlElement(name = "PubInfoTopicEventNum")
   public void setPubInfoTopicEventNum(String pubInfoTopicEventNum) {
      PubInfoTopicEventNum = pubInfoTopicEventNum;
   }

   public List<PubInfoTopicEventID> getPubInfoTopicEventIDArea() {
      return PubInfoTopicEventIDArea;
   }
   @XmlElement(name = "PubInfoTopicEventIDArea")
   public void setPubInfoTopicEventIDArea(List<PubInfoTopicEventID> pubInfoTopicEventIDArea) {
      PubInfoTopicEventIDArea = pubInfoTopicEventIDArea;
   }
}
