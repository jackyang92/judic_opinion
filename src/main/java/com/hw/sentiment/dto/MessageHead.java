package com.hw.sentiment.dto;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ymy
 * @date 2020/1/2
 * @description 描述信息
 */
@XmlRootElement(name="MessageHead")
public class MessageHead {
    private String DayTime;
   private String MsgID;
   private String MsgType;
   private String OperateType;
   private String Priority;
   private String ProtocolType;
   private String SendType;

    public String getDayTime() {
        return DayTime;
    }
    @XmlAttribute(name = "DayTime")
    public void setDayTime(String DayTime) {
        this.DayTime = DayTime;
    }

    public String getMsgID() {
        return MsgID;
    }
    @XmlAttribute(name = "MsgID")
    public void setMsgID(String MsgID) {
        this.MsgID = MsgID;
    }

    public String getMsgType() {
        return MsgType;
    }
    @XmlAttribute(name = "MsgType")
    public void setMsgType(String MsgType) {
        this.MsgType = MsgType;
    }

    public String getOperateType() {
        return OperateType;
    }
    @XmlAttribute(name = "OperateType")
    public void setOperateType(String OperateType) {
        this.OperateType = OperateType;
    }

    public String getPriority() {
        return Priority;
    }
    @XmlAttribute(name = "Priority")
    public void setPriority(String Priority) {
        this.Priority = Priority;
    }

    public String getProtocolType() {
        return ProtocolType;
    }
    @XmlAttribute(name = "ProtocolType")
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    public String getSendType() {
        return SendType;
    }
    @XmlAttribute(name = "SendType")
    public void setSendType(String SendType) {
        this.SendType = SendType;
    }
}
