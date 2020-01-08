package com.hw.sentiment.domain;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author ymy
 * @date 2019/12/28
 * @description 舆情简报实体类
 */
@Data
public class PubOpinionBriefing {
    private String id;
    private Timestamp creatTime;
    private String PubInfoBriefReportID;
    private String PubInfoBriefReportWriteTime;
    private String PubInfoBriefReportSendTime;
    private String PubInfoBriefReportType;
    private String PubInfoFileName;
    private String PubInfoFileLength;
    private String PubInfoFileContent;
}
