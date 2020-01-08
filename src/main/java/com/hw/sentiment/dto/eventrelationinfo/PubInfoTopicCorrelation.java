package com.hw.sentiment.dto.eventrelationinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/4
 * @description 描述信息
 */
@XmlRootElement(name = "PubInfoTopicCorrelation")
public class PubInfoTopicCorrelation {
   private String CorrelationTopicID;
   private String CorrelationTopicEventNum;
   private List<CorrelationTopicEventIDArea> CorrelationTopicEventIDArea;
   private String CorrelationCoefficient;

   public String getCorrelationTopicID() {
      return CorrelationTopicID;
   }
   @XmlElement(name = "CorrelationTopicID")
   public void setCorrelationTopicID(String correlationTopicID) {
      CorrelationTopicID = correlationTopicID;
   }

   public String getCorrelationTopicEventNum() {
      return CorrelationTopicEventNum;
   }
   @XmlElement(name = "CorrelationTopicEventNum")
   public void setCorrelationTopicEventNum(String correlationTopicEventNum) {
      CorrelationTopicEventNum = correlationTopicEventNum;
   }

   public List<CorrelationTopicEventIDArea> getCorrelationTopicEventIDArea() {
      return CorrelationTopicEventIDArea;
   }
   @XmlElement(name = "CorrelationTopicEventIDArea")
   public void setCorrelationTopicEventIDArea(List<CorrelationTopicEventIDArea> correlationTopicEventIDArea) {
      CorrelationTopicEventIDArea = correlationTopicEventIDArea;
   }

   public String getCorrelationCoefficient() {
      return CorrelationCoefficient;
   }
   @XmlElement(name = "CorrelationCoefficient")
   public void setCorrelationCoefficient(String correlationCoefficient) {
      CorrelationCoefficient = correlationCoefficient;
   }
}
