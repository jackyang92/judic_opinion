package com.hw.sentiment.dto.eventrelationinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ymy
 * @date 2020/1/4
 * @description 描述信息
 */
@XmlRootElement(name = "CorrelationTopicEventIDArea")
public class CorrelationTopicEventIDArea {
    private String PubInfoID;

    public String getPubInfoID() {
        return PubInfoID;
    }
    @XmlElement(name = "PubInfoID")
    public void setPubInfoID(String pubInfoID) {
        PubInfoID = pubInfoID;
    }
}
