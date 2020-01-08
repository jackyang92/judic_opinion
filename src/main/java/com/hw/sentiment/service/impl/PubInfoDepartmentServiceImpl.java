package com.hw.sentiment.service.impl;

import com.hw.sentiment.domain.PubInfoDepartment;
import com.hw.sentiment.mapper.PubInfoDepartmentMapper;
import com.hw.sentiment.service.PubInfoDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 描述信息
 */
@Service
public class PubInfoDepartmentServiceImpl implements PubInfoDepartmentService {

    @Autowired
    private PubInfoDepartmentMapper pubInfoDepartmentMapper;
    @Override
    public void insert(PubInfoDepartment dept) {
        pubInfoDepartmentMapper.insert(dept);
    }
}
