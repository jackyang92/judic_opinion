package com.hw.sentiment.dto;

import com.hw.sentiment.domain.PubInfoFile;
import lombok.Data;

/**
 * @author ymy
 * @date 2019/12/27
 * @description 舆情附件信息区
 */
@Data
public class PubInfoFileInputDTO extends PubInfoFile {
    private String PubInfoFileID;
    private String PubInfoFileName;
    private String PubInfoFileType;
    private String PubInfoFileLength;
    private String PubInfoFileContent;
}
