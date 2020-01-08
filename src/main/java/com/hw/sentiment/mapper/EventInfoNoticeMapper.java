package com.hw.sentiment.mapper;

import com.hw.sentiment.domain.EventInfoNotice;
import com.hw.sentiment.domain.vo.EventInfoNoticeVo;
import com.hw.sentiment.dto.EventInfoNoticeInputDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 描述信息
 */
@Mapper
public interface EventInfoNoticeMapper {
    void insert(EventInfoNotice eventInfoNotice);

    EventInfoNoticeVo query();
}
