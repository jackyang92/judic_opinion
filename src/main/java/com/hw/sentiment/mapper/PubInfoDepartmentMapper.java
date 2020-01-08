package com.hw.sentiment.mapper;

import com.hw.sentiment.domain.PubInfoDepartment;
import com.hw.sentiment.dto.PubInfoDepartmentInputDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 描述信息
 */
@Mapper
public interface PubInfoDepartmentMapper {
    void insert(PubInfoDepartment dept);

    List<PubInfoDepartmentInputDTO> findByPid(String pid);
}
