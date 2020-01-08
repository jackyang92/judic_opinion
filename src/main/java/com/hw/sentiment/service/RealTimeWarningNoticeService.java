package com.hw.sentiment.service;

import com.hw.sentiment.domain.RealTimeWarningNotice;

import java.util.List;

/**
 * @author ymy
 * @date 2019/12/25
 * @description 描述信息
 */

public interface RealTimeWarningNoticeService {

    void insert(RealTimeWarningNotice notice);

    RealTimeWarningNotice query(String PubInfoTopicID);

    String get(String PubInfoTopicID);
}
