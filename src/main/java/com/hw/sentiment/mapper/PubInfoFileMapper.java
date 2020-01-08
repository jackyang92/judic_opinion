package com.hw.sentiment.mapper;

import com.hw.sentiment.domain.PubInfoFile;
import com.hw.sentiment.dto.PubInfoFileInputDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 描述信息
 */
@Mapper
public interface PubInfoFileMapper {
    void insert(PubInfoFile file);

    List<PubInfoFileInputDTO> findByFid(String fid);
}
