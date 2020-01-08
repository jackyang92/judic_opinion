package com.hw.sentiment.service;

import com.hw.sentiment.domain.EventInfoNotice;
import com.hw.sentiment.dto.EventInfoNoticeInputDTO;

import java.util.List;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 描述信息
 */
public interface EventInfoNoticeService {
    void insert(EventInfoNotice eventInfoNotice);

    EventInfoNotice query();
}
