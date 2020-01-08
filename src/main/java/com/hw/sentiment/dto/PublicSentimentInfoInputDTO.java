package com.hw.sentiment.dto;

import com.hw.sentiment.domain.PublicSentimentInfo;
import lombok.Data;

import java.util.List;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 舆情事件信息区,包含附件信息、涉及部门信息、涉及部门业务信息
 */
@Data
public class PublicSentimentInfoInputDTO extends PublicSentimentInfo {
    private String PubInfoID;
    private String PubInfoTitile;
    private String PubInfoContent;
    private String PubInfoTime;
    private String PubInfoSrcType;
    private String PubInfoSrcWebsiteName;
    private String PubInfoSrcNetizenName;
    private String PubInfoForwardNum;
    private String PubInfoSrcWebsiteLink;
    private String PubInfoFileNum;
    private String PubInfoCorType;
    private String PubInfoDepartmentNum;
    private String PubInfoDepartmentWorkNum;

    private List<PubInfoFileInputDTO> pubInfoFileInputDTOArea;
    private List<PubInfoDepartmentInputDTO> pubInfoDepartmentInputDTOArea;
    private List<PubInfoDepartmentWorkInputDTO> pubInfoDepartmentWorkInputDTOArea;
}
