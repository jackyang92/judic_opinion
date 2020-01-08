package com.hw.sentiment.dto;

import com.hw.sentiment.domain.EventInfoNotice;
import lombok.Data;

import java.util.List;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 舆情事件通知
 */
@Data
public class EventInfoNoticeInputDTO extends EventInfoNotice {
    private String PubInfoSendType;
    private String PubInfoSerialNum;
    private String PubInfoCaseName;
    private String PubInfoCaseJudgeName;
    private String PublicSentimentInfoNum;

    private List<PublicSentimentInfoInputDTO> publicSentimentInfoArea;
}
