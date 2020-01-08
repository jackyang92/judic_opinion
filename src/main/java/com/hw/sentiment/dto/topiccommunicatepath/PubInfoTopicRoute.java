package com.hw.sentiment.dto.topiccommunicatepath;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/4
 * @description 描述信息
 */
@XmlRootElement(name = "PubInfoTopicRoute")
public class PubInfoTopicRoute {
    private String PubInfoID;
    private String PubInfoStartTime;
    private List<PubInfoCommunicator> PubInfoCommunicatorArea;
    private List<PubInfoBeCommunicator> PubInfoBeCommunicatorArea;
    private List<PubInfoCommunicateDetail> PubInfoCommunicateDetailArea;

    public String getPubInfoID() {
        return PubInfoID;
    }
    @XmlElement(name = "PubInfoID")
    public void setPubInfoID(String pubInfoID) {
        PubInfoID = pubInfoID;
    }

    public String getPubInfoStartTime() {
        return PubInfoStartTime;
    }
    @XmlElement(name = "PubInfoStartTime")
    public void setPubInfoStartTime(String pubInfoStartTime) {
        PubInfoStartTime = pubInfoStartTime;
    }

    public List<PubInfoCommunicator> getPubInfoCommunicatorArea() {
        return PubInfoCommunicatorArea;
    }
    @XmlElement(name = "PubInfoCommunicatorArea")
    public void setPubInfoCommunicatorArea(List<PubInfoCommunicator> pubInfoCommunicatorArea) {
        PubInfoCommunicatorArea = pubInfoCommunicatorArea;
    }

    public List<PubInfoBeCommunicator> getPubInfoBeCommunicatorArea() {
        return PubInfoBeCommunicatorArea;
    }
    @XmlElement(name = "PubInfoBeCommunicatorArea")
    public void setPubInfoBeCommunicatorArea(List<PubInfoBeCommunicator> pubInfoBeCommunicatorArea) {
        PubInfoBeCommunicatorArea = pubInfoBeCommunicatorArea;
    }

    public List<PubInfoCommunicateDetail> getPubInfoCommunicateDetailArea() {
        return PubInfoCommunicateDetailArea;
    }
    @XmlElement(name = "PubInfoCommunicateDetailArea")
    public void setPubInfoCommunicateDetailArea(List<PubInfoCommunicateDetail> pubInfoCommunicateDetailArea) {
        PubInfoCommunicateDetailArea = pubInfoCommunicateDetailArea;
    }
}
