package com.hw.sentiment.domain.vo;

import com.hw.sentiment.domain.*;
import com.hw.sentiment.dto.PublicSentimentInfoInputDTO;
import lombok.Data;

import java.util.List;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 描述信息
 */
@Data
public class EventInfoNoticeVo extends EventInfoNotice {

    private List<PublicSentimentInfo> publicSentimentInfoList;
    private List<PubInfoDepartment> pubInfoDepartmentList;
    private List<PubInfoDepartmentWork> pubInfoDepartmentWorkList;
    private List<PubInfoFile> pubInfoFileList;
}
