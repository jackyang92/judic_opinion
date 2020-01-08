package com.hw.sentiment.dto;

import com.hw.sentiment.domain.PubInfoDepartment;
import lombok.Data;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 舆情涉及部门信息区
 */
@Data
public class PubInfoDepartmentInputDTO extends PubInfoDepartment {
    private String PubInfoDepartmentType;
    private String PubInfoDepartmentLevel;
    private String PubInfoDepProvince;
    private String PubInfoDepCity;
    private String PubInfoDepartmentArea;
    private String PubInfoDepartmentName;

}
