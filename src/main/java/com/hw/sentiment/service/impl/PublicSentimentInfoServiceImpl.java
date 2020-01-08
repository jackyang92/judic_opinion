package com.hw.sentiment.service.impl;

import com.hw.sentiment.domain.PublicSentimentInfo;
import com.hw.sentiment.mapper.PublicSentimentInfoMapper;
import com.hw.sentiment.service.PublicSentimentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 描述信息
 */
@Service
public class PublicSentimentInfoServiceImpl implements PublicSentimentInfoService {

    @Autowired
    private PublicSentimentInfoMapper publicSentimentInfoMapper;
    @Override
    public void insert(PublicSentimentInfo info) {
        publicSentimentInfoMapper.insert(info);
    }

    @Override
    public String get(String PubInfoID) {
        return publicSentimentInfoMapper.get(PubInfoID);
    }
}
