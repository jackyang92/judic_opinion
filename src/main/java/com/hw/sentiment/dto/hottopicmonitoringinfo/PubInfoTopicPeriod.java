package com.hw.sentiment.dto.hottopicmonitoringinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ymy
 * @date 2020/1/4
 * @description 描述信息
 */
@XmlRootElement(name = "PubInfoTopicPeriod")
public class PubInfoTopicPeriod {
    private String TopicPeriodStartTime;
    private String TopicPeriodEndTime;
    private String PeriodNetMediaNum;
    private String PeriodNetMediaNumRatio;
    private String PeriodPostNum;
    private String PeriodClickRate;
    private String PeriodCommentNum;
    private String PeriodForwardNum;
    private String PeriodJoinPersonNum;
    private String PeriodPostRatio;
    private String PeriodPositiveRatio;
    private String PeriodNegativeRatio;
    private String PeriodNeutralRatio;
    private String PeriodSpreadCityNum;

    public String getTopicPeriodStartTime() {
        return TopicPeriodStartTime;
    }
    @XmlElement(name = "TopicPeriodStartTime")
    public void setTopicPeriodStartTime(String topicPeriodStartTime) {
        TopicPeriodStartTime = topicPeriodStartTime;
    }

    public String getTopicPeriodEndTime() {
        return TopicPeriodEndTime;
    }
    @XmlElement(name = "TopicPeriodEndTime")
    public void setTopicPeriodEndTime(String topicPeriodEndTime) {
        TopicPeriodEndTime = topicPeriodEndTime;
    }

    public String getPeriodNetMediaNum() {
        return PeriodNetMediaNum;
    }
    @XmlElement(name = "PeriodNetMediaNum")
    public void setPeriodNetMediaNum(String periodNetMediaNum) {
        PeriodNetMediaNum = periodNetMediaNum;
    }

    public String getPeriodNetMediaNumRatio() {
        return PeriodNetMediaNumRatio;
    }
    @XmlElement(name = "PeriodNetMediaNumRatio")
    public void setPeriodNetMediaNumRatio(String periodNetMediaNumRatio) {
        PeriodNetMediaNumRatio = periodNetMediaNumRatio;
    }

    public String getPeriodPostNum() {
        return PeriodPostNum;
    }
    @XmlElement(name = "PeriodPostNum")
    public void setPeriodPostNum(String periodPostNum) {
        PeriodPostNum = periodPostNum;
    }

    public String getPeriodClickRate() {
        return PeriodClickRate;
    }
    @XmlElement(name = "PeriodClickRate")
    public void setPeriodClickRate(String periodClickRate) {
        PeriodClickRate = periodClickRate;
    }

    public String getPeriodCommentNum() {
        return PeriodCommentNum;
    }
    @XmlElement(name = "PeriodCommentNum")
    public void setPeriodCommentNum(String periodCommentNum) {
        PeriodCommentNum = periodCommentNum;
    }

    public String getPeriodForwardNum() {
        return PeriodForwardNum;
    }
    @XmlElement(name = "PeriodForwardNum")
    public void setPeriodForwardNum(String periodForwardNum) {
        PeriodForwardNum = periodForwardNum;
    }

    public String getPeriodJoinPersonNum() {
        return PeriodJoinPersonNum;
    }
    @XmlElement(name = "PeriodJoinPersonNum")
    public void setPeriodJoinPersonNum(String periodJoinPersonNum) {
        PeriodJoinPersonNum = periodJoinPersonNum;
    }

    public String getPeriodPostRatio() {
        return PeriodPostRatio;
    }
    @XmlElement(name = "PeriodPostRatio")
    public void setPeriodPostRatio(String periodPostRatio) {
        PeriodPostRatio = periodPostRatio;
    }

    public String getPeriodPositiveRatio() {
        return PeriodPositiveRatio;
    }
    @XmlElement(name = "PeriodPositiveRatio")
    public void setPeriodPositiveRatio(String periodPositiveRatio) {
        PeriodPositiveRatio = periodPositiveRatio;
    }

    public String getPeriodNegativeRatio() {
        return PeriodNegativeRatio;
    }
    @XmlElement(name = "PeriodNegativeRatio")
    public void setPeriodNegativeRatio(String periodNegativeRatio) {
        PeriodNegativeRatio = periodNegativeRatio;
    }

    public String getPeriodNeutralRatio() {
        return PeriodNeutralRatio;
    }
    @XmlElement(name = "PeriodNeutralRatio")
    public void setPeriodNeutralRatio(String periodNeutralRatio) {
        PeriodNeutralRatio = periodNeutralRatio;
    }

    public String getPeriodSpreadCityNum() {
        return PeriodSpreadCityNum;
    }
    @XmlElement(name = "PeriodSpreadCityNum")
    public void setPeriodSpreadCityNum(String periodSpreadCityNum) {
        PeriodSpreadCityNum = periodSpreadCityNum;
    }
}
