package com.hw.sentiment.dto;

import lombok.Data;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 描述信息
 */
@Data
public class PublicSentimentGetInfoOutputDTO {
    private String PubInfoID;
    private String PlatCfgRslt;
    private String PlatInfoArea;
}
