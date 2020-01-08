package com.hw.sentiment.domain;

import lombok.Data;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 舆情涉及部门信息区
 */
@Data
public class PubInfoDepartment {
    private String id;
    private String pid;
    private String PubInfoDepartmentType;
    private String PubInfoDepartmentLevel;
    private String PubInfoDepProvince;
    private String PubInfoDepCity;
    private String PubInfoDepartmentArea;
    private String PubInfoDepartmentName;

}
