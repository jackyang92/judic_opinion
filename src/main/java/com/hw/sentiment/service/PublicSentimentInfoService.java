package com.hw.sentiment.service;

import com.hw.sentiment.domain.PublicSentimentInfo;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 描述信息
 */
public interface PublicSentimentInfoService {
    void insert(PublicSentimentInfo info);
    String get(String PubInfoID);
}
