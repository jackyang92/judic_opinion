package com.hw.sentiment.mapper;

import com.hw.sentiment.domain.RealTimeWarningNotice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ymy
 * @date 2019/12/25
 * @description 描述信息
 */
@Mapper
public interface RealTimeWarningNoticeMapper {

    void insert(RealTimeWarningNotice notice);

    RealTimeWarningNotice query(String PubInfoTopicID);

    String get(String PubInfoTopicID);
}
