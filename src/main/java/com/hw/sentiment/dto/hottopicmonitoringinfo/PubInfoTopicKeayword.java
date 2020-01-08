package com.hw.sentiment.dto.hottopicmonitoringinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ymy
 * @date 2020/1/4
 * @description 描述信息
 */
@XmlRootElement(name = "PubInfoTopicKeayword")
public class PubInfoTopicKeayword {
    private String Keayword;

    public String getKeayword() {
        return Keayword;
    }
    @XmlElement(name = "Keayword")
    public void setKeayword(String keayword) {
        Keayword = keayword;
    }
}
