package com.hw.sentiment.service.impl;

import com.hw.sentiment.domain.PubInfoFile;
import com.hw.sentiment.mapper.PubInfoFileMapper;
import com.hw.sentiment.service.PubInfoFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 描述信息
 */
@Service
public class PubInfoFileServiceImpl implements PubInfoFileService {

    @Autowired
    private PubInfoFileMapper pubInfoFileMapper;
    @Override
    public void insert(PubInfoFile file) {
        pubInfoFileMapper.insert(file);
    }
}
