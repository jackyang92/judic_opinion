package com.hw.sentiment.dto.hottopicmonitoringinfo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ymy
 * @date 2020/1/4
 * @description 描述信息
 */
@XmlRootElement(name = "PubInfoTopicViewpointInfo")
public class PubInfoTopicViewpointInfo {
    private String ViewpointContent;
    private String ViewpointRatio;

    public String getViewpointContent() {
        return ViewpointContent;
    }
    @XmlElement(name = "ViewpointContent")
    public void setViewpointContent(String viewpointContent) {
        ViewpointContent = viewpointContent;
    }

    public String getViewpointRatio() {
        return ViewpointRatio;
    }
    @XmlElement(name = "ViewpointRatio")
    public void setViewpointRatio(String viewpointRatio) {
        ViewpointRatio = viewpointRatio;
    }
}
