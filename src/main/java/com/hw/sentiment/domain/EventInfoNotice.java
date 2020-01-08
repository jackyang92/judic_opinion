package com.hw.sentiment.domain;

import com.hw.sentiment.dto.PublicSentimentInfoInputDTO;
import lombok.Data;
import org.apache.catalina.User;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 舆情事件通知
 */
@Data
public class EventInfoNotice {
    private String id;
    private Timestamp operateTime;
    private String PubInfoSendType;
    private String PubInfoSerialNum;
    private String PubInfoCaseName;
    private String PubInfoCaseJudgeName;
    private String PublicSentimentInfoNum;
}
