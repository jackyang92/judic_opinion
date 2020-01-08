package com.hw.sentiment.mapper;

import com.hw.sentiment.domain.PubOpinionBriefing;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ymy
 * @date 2019/12/28
 * @description 描述信息
 */
@Mapper
public interface PubOpinionBriefingMapper {
    String get(String PubInfoBriefReportID);

    void insert(PubOpinionBriefing breif);

    PubOpinionBriefing query();
}
