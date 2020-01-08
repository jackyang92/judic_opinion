package com.hw.sentiment.dto;

import lombok.Data;

import java.util.List;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 舆情事件信息接收返回信息
 */
@Data
public class SentimentInfoResultOutputDTO {
    private String PublicSentimentInfoNum;
    private List<PublicSentimentGetInfoOutputDTO> PublicSentimentIGetInfoArea;
}
