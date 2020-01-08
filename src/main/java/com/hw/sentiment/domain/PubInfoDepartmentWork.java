package com.hw.sentiment.domain;

import lombok.Data;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 舆情涉及部门业务信息区
 */
@Data
public class PubInfoDepartmentWork {
   private String id;
   private String wid;
   private String PubInfoDepartmentWorkType;
   private String PubInfoDepartmentWorkContent;
}
