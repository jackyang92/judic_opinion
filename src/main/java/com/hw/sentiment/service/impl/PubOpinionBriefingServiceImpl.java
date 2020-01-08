package com.hw.sentiment.service.impl;

import com.hw.sentiment.domain.PubOpinionBriefing;
import com.hw.sentiment.mapper.PubOpinionBriefingMapper;
import com.hw.sentiment.service.PubOpinionBriefingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ymy
 * @date 2019/12/28
 * @description 描述信息
 */
@Service
public class PubOpinionBriefingServiceImpl implements PubOpinionBriefingService {

    @Autowired
    private PubOpinionBriefingMapper pubOpinionBriefingMapper;
    @Override
    public String get(String PubInfoBriefReportID) {

        return  pubOpinionBriefingMapper.get(PubInfoBriefReportID);
    }

    @Override
    public void insert(PubOpinionBriefing breif) {
        pubOpinionBriefingMapper.insert(breif);
    }

    @Override
    public PubOpinionBriefing query() {

        return  pubOpinionBriefingMapper.query();
    }
}
