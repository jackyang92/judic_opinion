package com.hw.sentiment.dto.businessmonitorinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ymy
 * @date 2020/1/3
 * @description 正面舆情信息标识区
 */
@XmlRootElement(name = "PubInfoPositiveID")
public class PubInfoPositiveID {
    private String PubInfoID;

    public String getPubInfoID() {
        return PubInfoID;
    }
    @XmlElement(name = "PubInfoID")
    public void setPubInfoID(String pubInfoID) {
        PubInfoID = pubInfoID;
    }
}
