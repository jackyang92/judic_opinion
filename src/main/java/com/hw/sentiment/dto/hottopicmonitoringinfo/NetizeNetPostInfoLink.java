package com.hw.sentiment.dto.hottopicmonitoringinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ymy
 * @date 2020/1/4
 * @description 描述信息
 */
@XmlRootElement(name = "NetizeNetPostInfoLink")
public class NetizeNetPostInfoLink {
    private String NetizeNetPostLink;

    public String getNetizeNetPostLink() {
        return NetizeNetPostLink;
    }
    @XmlElement(name = "NetizeNetPostLink")
    public void setNetizeNetPostLink(String netizeNetPostLink) {
        NetizeNetPostLink = netizeNetPostLink;
    }
}
