package com.hw.sentiment.dto;

import com.hw.sentiment.domain.PubInfoDepartmentWork;
import lombok.Data;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 舆情涉及部门业务信息区
 */
@Data
public class PubInfoDepartmentWorkInputDTO extends PubInfoDepartmentWork {
   private String PubInfoDepartmentWorkType;
   private String PubInfoDepartmentWorkContent;
}
