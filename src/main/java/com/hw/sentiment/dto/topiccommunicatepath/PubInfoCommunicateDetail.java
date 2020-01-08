package com.hw.sentiment.dto.topiccommunicatepath;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ymy
 * @date 2020/1/4
 * @description 描述信息
 */
@XmlRootElement(name = "PubInfoCommunicateDetail")
public class PubInfoCommunicateDetail {
    private String CommunicateTopic;
    private String CommunicateContent;
    private String CommunicateViewpoint;
    private String CommunicateEmotion;
    private String CommunicateBeforwardNum;
    private String CommunicateContentType;
    private String CommunicateWorkType;
    private String CommunicateDepartment;

    public String getCommunicateTopic() {
        return CommunicateTopic;
    }
    @XmlElement(name = "CommunicateTopic")
    public void setCommunicateTopic(String communicateTopic) {
        CommunicateTopic = communicateTopic;
    }

    public String getCommunicateContent() {
        return CommunicateContent;
    }
    @XmlElement(name = "CommunicateContent")
    public void setCommunicateContent(String communicateContent) {
        CommunicateContent = communicateContent;
    }

    public String getCommunicateViewpoint() {
        return CommunicateViewpoint;
    }
    @XmlElement(name = "CommunicateViewpoint")
    public void setCommunicateViewpoint(String communicateViewpoint) {
        CommunicateViewpoint = communicateViewpoint;
    }

    public String getCommunicateEmotion() {
        return CommunicateEmotion;
    }
    @XmlElement(name = "CommunicateEmotion")
    public void setCommunicateEmotion(String communicateEmotion) {
        CommunicateEmotion = communicateEmotion;
    }

    public String getCommunicateBeforwardNum() {
        return CommunicateBeforwardNum;
    }
    @XmlElement(name = "CommunicateBeforwardNum")
    public void setCommunicateBeforwardNum(String communicateBeforwardNum) {
        CommunicateBeforwardNum = communicateBeforwardNum;
    }

    public String getCommunicateContentType() {
        return CommunicateContentType;
    }
    @XmlElement(name = "CommunicateContentType")
    public void setCommunicateContentType(String communicateContentType) {
        CommunicateContentType = communicateContentType;
    }

    public String getCommunicateWorkType() {
        return CommunicateWorkType;
    }
    @XmlElement(name = "CommunicateWorkType")
    public void setCommunicateWorkType(String communicateWorkType) {
        CommunicateWorkType = communicateWorkType;
    }

    public String getCommunicateDepartment() {
        return CommunicateDepartment;
    }
    @XmlElement(name = "CommunicateDepartment")
    public void setCommunicateDepartment(String communicateDepartment) {
        CommunicateDepartment = communicateDepartment;
    }
}
