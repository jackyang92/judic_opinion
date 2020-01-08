package com.hw.sentiment.domain;

import lombok.Data;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 舆情附件信息区
 */
@Data
public class PubInfoFile {
    private String id;
    private String fid;
    private String PubInfoFileID;
    private String PubInfoFileName;
    private String PubInfoFileType;
    private String PubInfoFileLength;
    private String PubInfoFileContent;
}
