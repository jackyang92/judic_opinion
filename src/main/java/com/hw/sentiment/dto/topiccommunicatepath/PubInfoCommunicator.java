package com.hw.sentiment.dto.topiccommunicatepath;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ymy
 * @date 2020/1/4
 * @description 描述信息
 */
@XmlRootElement(name = "PubInfoCommunicator")
public class PubInfoCommunicator {
    private String CommunicatorName;
    private String CommunicatorRegion;
    private String CommunicatorAdress;
    private String CommunicatorType;
    private String CommunicatorJoinTime;
    private String CommunicatorFriendNum;
    private String CommunicatorFanNum;

    public String getCommunicatorName() {
        return CommunicatorName;
    }
    @XmlElement(name = "CommunicatorName")
    public void setCommunicatorName(String communicatorName) {
        CommunicatorName = communicatorName;
    }

    public String getCommunicatorRegion() {
        return CommunicatorRegion;
    }
    @XmlElement(name = "CommunicatorRegion")
    public void setCommunicatorRegion(String communicatorRegion) {
        CommunicatorRegion = communicatorRegion;
    }

    public String getCommunicatorAdress() {
        return CommunicatorAdress;
    }
    @XmlElement(name = "CommunicatorAdress")
    public void setCommunicatorAdress(String communicatorAdress) {
        CommunicatorAdress = communicatorAdress;
    }

    public String getCommunicatorType() {
        return CommunicatorType;
    }
    @XmlElement(name = "CommunicatorType")
    public void setCommunicatorType(String communicatorType) {
        CommunicatorType = communicatorType;
    }

    public String getCommunicatorJoinTime() {
        return CommunicatorJoinTime;
    }
    @XmlElement(name = "CommunicatorJoinTime")
    public void setCommunicatorJoinTime(String communicatorJoinTime) {
        CommunicatorJoinTime = communicatorJoinTime;
    }

    public String getCommunicatorFriendNum() {
        return CommunicatorFriendNum;
    }
    @XmlElement(name = "CommunicatorFriendNum")
    public void setCommunicatorFriendNum(String communicatorFriendNum) {
        CommunicatorFriendNum = communicatorFriendNum;
    }

    public String getCommunicatorFanNum() {
        return CommunicatorFanNum;
    }
    @XmlElement(name = "CommunicatorFanNum")
    public void setCommunicatorFanNum(String communicatorFanNum) {
        CommunicatorFanNum = communicatorFanNum;
    }
}
