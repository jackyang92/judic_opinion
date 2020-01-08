package com.hw.sentiment.service.impl;

import com.hw.sentiment.domain.RealTimeWarningNotice;
import com.hw.sentiment.mapper.RealTimeWarningNoticeMapper;
import com.hw.sentiment.service.RealTimeWarningNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ymy
 * @date 2019/12/25
 * @description 描述信息
 */
@Service
public class RealTimeWarningNoticeServiceImpl implements RealTimeWarningNoticeService {

    @Autowired
    private RealTimeWarningNoticeMapper realTimeWarningNoticeMapper;

    @Override
    public void insert(RealTimeWarningNotice notice) {
        realTimeWarningNoticeMapper.insert(notice);
    }

    @Override
    public RealTimeWarningNotice query(String PubInfoTopicID) {
        return realTimeWarningNoticeMapper.query(PubInfoTopicID);
    }

    //查询PubInfoTopicID的值
    @Override
    public String get(String PubInfoTopicID) {
        return realTimeWarningNoticeMapper.get(PubInfoTopicID);
    }




}
