package com.hw.sentiment.mapper;

import com.hw.sentiment.domain.PubInfoDepartmentWork;
import com.hw.sentiment.dto.PubInfoDepartmentWorkInputDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 描述信息
 */
@Mapper
public interface PubInfoDepartmentWorkMapper {
    void insert(PubInfoDepartmentWork work);

    List<PubInfoDepartmentWorkInputDTO> findByWid(String wid);
}
