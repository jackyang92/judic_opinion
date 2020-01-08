package com.hw.sentiment.dto.hottopicmonitoringinfo;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 舆情附件信息区
 */
@XmlRootElement(name = "PubInfoFile")
public class PubInfoFile {

    private String PubInfoFileID;
    private String PubInfoFileName;
    private String PubInfoFileType;
    private String PubInfoFileLength;
    private String PubInfoFileContent;

    public String getPubInfoFileID() {
        return PubInfoFileID;
    }
    @XmlElement(name = "PubInfoFileID")
    public void setPubInfoFileID(String pubInfoFileID) {
        PubInfoFileID = pubInfoFileID;
    }

    public String getPubInfoFileName() {
        return PubInfoFileName;
    }
    @XmlElement(name = "PubInfoFileName")
    public void setPubInfoFileName(String pubInfoFileName) {
        PubInfoFileName = pubInfoFileName;
    }

    public String getPubInfoFileType() {
        return PubInfoFileType;
    }
    @XmlElement(name = "PubInfoFileType")
    public void setPubInfoFileType(String pubInfoFileType) {
        PubInfoFileType = pubInfoFileType;
    }

    public String getPubInfoFileLength() {
        return PubInfoFileLength;
    }
    @XmlElement(name = "PubInfoFileLength")
    public void setPubInfoFileLength(String pubInfoFileLength) {
        PubInfoFileLength = pubInfoFileLength;
    }

    public String getPubInfoFileContent() {
        return PubInfoFileContent;
    }
    @XmlElement(name = "PubInfoFileContent")
    public void setPubInfoFileContent(String pubInfoFileContent) {
        PubInfoFileContent = pubInfoFileContent;
    }
}
