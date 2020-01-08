package com.hw.sentiment.dto.topiccommunicatepath;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ymy
 * @date 2020/1/4
 * @description 描述信息
 */
@XmlRootElement(name = "PubInfoBeCommunicator")
public class PubInfoBeCommunicator {
    private String BeCommunicatorName;
    private String BeCommunicatorRegion;
    private String BeCommunicatorAdress;
    private String BeCommunicatorType;
    private String CommunicatorJoinTime;
    private String CommunicatorFriendNum;
    private String CommunicatorFanNum;

    public String getBeCommunicatorName() {
        return BeCommunicatorName;
    }
    @XmlElement(name = "BeCommunicatorName")
    public void setBeCommunicatorName(String beCommunicatorName) {
        BeCommunicatorName = beCommunicatorName;
    }

    public String getBeCommunicatorRegion() {
        return BeCommunicatorRegion;
    }
    @XmlElement(name = "BeCommunicatorRegion")
    public void setBeCommunicatorRegion(String beCommunicatorRegion) {
        BeCommunicatorRegion = beCommunicatorRegion;
    }

    public String getBeCommunicatorAdress() {
        return BeCommunicatorAdress;
    }
    @XmlElement(name = "BeCommunicatorAdress")
    public void setBeCommunicatorAdress(String beCommunicatorAdress) {
        BeCommunicatorAdress = beCommunicatorAdress;
    }

    public String getBeCommunicatorType() {
        return BeCommunicatorType;
    }
    @XmlElement(name = "BeCommunicatorType")
    public void setBeCommunicatorType(String beCommunicatorType) {
        BeCommunicatorType = beCommunicatorType;
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
