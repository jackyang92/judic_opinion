package com.hw.sentiment.dto.businessmonitorinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ymy
 * @date 2020/1/3
 * @description 该类业务省份舆情信息标识区
 */
@XmlRootElement(name = "ProvincePubInfoWorkID")
public class ProvincePubInfoWorkID {
    private String PubInfoID;

    public String getPubInfoID() {
        return PubInfoID;
    }
    @XmlElement(name = "PubInfoID")
    public void setPubInfoID(String pubInfoID) {
        PubInfoID = pubInfoID;
    }
}
