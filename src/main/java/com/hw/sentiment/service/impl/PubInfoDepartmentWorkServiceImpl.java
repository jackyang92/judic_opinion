package com.hw.sentiment.service.impl;

import com.hw.sentiment.domain.PubInfoDepartmentWork;
import com.hw.sentiment.mapper.PubInfoDepartmentWorkMapper;
import com.hw.sentiment.service.PubInfoDepartmentWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 描述信息
 */
@Service
public class PubInfoDepartmentWorkServiceImpl implements PubInfoDepartmentWorkService {

    @Autowired
    private PubInfoDepartmentWorkMapper pubInfoDepartmentWorkMapper;
    @Override
    public void insert(PubInfoDepartmentWork work) {
        pubInfoDepartmentWorkMapper.insert(work);
    }
}
