package com.hw.sentiment.mapper;

import com.hw.sentiment.domain.PublicSentimentInfo;
import com.hw.sentiment.dto.PublicSentimentGetInfoOutputDTO;
import com.hw.sentiment.service.PublicSentimentInfoService;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 描述信息
 */
@Mapper
public interface PublicSentimentInfoMapper {
    void insert(PublicSentimentInfo info);

    String get(String pubInfoID);

    List<PublicSentimentInfo> findByEid(String eid);
}
