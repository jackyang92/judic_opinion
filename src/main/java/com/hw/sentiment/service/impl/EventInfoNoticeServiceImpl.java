package com.hw.sentiment.service.impl;

import com.hw.sentiment.domain.*;
import com.hw.sentiment.domain.vo.EventInfoNoticeVo;
import com.hw.sentiment.dto.EventInfoNoticeInputDTO;
import com.hw.sentiment.mapper.*;
import com.hw.sentiment.service.EventInfoNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 描述信息
 */
@Service
public class EventInfoNoticeServiceImpl implements EventInfoNoticeService {

    @Autowired
    private EventInfoNoticeMapper eventInfoNoticeMapper;

    @Autowired
    private PubInfoDepartmentMapper pubInfoDepartmentMapper;

    @Autowired
    private PubInfoDepartmentWorkMapper pubInfoDepartmentWorkMapper;

    @Autowired
    private PubInfoFileMapper pubInfoFileMapper;

    @Autowired
    private PublicSentimentInfoMapper publicSentimentInfoMapper;



    @Override
    public void insert(EventInfoNotice eventInfoNotice) {
        eventInfoNoticeMapper.insert(eventInfoNotice);
    }

    @Override
    public EventInfoNoticeVo query() {
        EventInfoNoticeVo query = eventInfoNoticeMapper.query();
        List<PublicSentimentInfo> publicSentimentInfoList = publicSentimentInfoMapper.findByEid(query.getId());
        query.setPublicSentimentInfoList(publicSentimentInfoList);
        //ArrayList<Object> list = new ArrayList<>();
        for (PublicSentimentInfo info : publicSentimentInfoList) {
            String id = info.getId();
            info.setPubInfoFileInputDTOArea(pubInfoFileMapper.findByFid(id));
            info.setPubInfoDepartmentInputDTOArea(pubInfoDepartmentMapper.findByPid(id));
            info.setPubInfoDepartmentWorkInputDTOArea(pubInfoDepartmentWorkMapper.findByWid(id));
        }
//        List<PubInfoDepartment> PubInfoDepartmentList = pubInfoDepartmentMapper.findByPid(query.getId());
//        query.setPubInfoDepartmentList(PubInfoDepartmentList);
        return query;
    }
}
