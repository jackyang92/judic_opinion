package com.hw.sentiment.service;

import com.hw.sentiment.domain.PubOpinionBriefing;

import java.util.List;

/**
 * @author ymy
 * @date 2019/12/28
 * @description 描述信息
 */
public interface PubOpinionBriefingService {

    String get(String PubInfoBriefReportID);

    void insert(PubOpinionBriefing breif);

    PubOpinionBriefing query();
}
