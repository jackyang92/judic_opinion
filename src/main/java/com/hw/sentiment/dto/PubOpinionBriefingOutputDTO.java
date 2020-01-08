package com.hw.sentiment.dto;

import lombok.Data;

/**
 * @author ymy
 * @date 2019/12/28
 * @description 简报返回信息
 */
@Data
public class PubOpinionBriefingOutputDTO {
    private String PlatCfgRslt;
    private String PlatInfoArea;
    private String PubInfoTopicID;
    private String PubInfoFileName;
}
