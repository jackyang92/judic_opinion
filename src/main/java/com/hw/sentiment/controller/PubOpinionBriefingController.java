package com.hw.sentiment.controller;

import com.hw.sentiment.domain.PubOpinionBriefing;
import com.hw.sentiment.dto.PubOpinionBriefingOutputDTO;
import com.hw.sentiment.service.PubOpinionBriefingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author ymy
 * @date 2019/12/28
 * @description 简报推送请求和应答
 */
@Api(tags ="PubOpinionBriefingController",description = "简报推送请求和应答")
@RestController
@RequestMapping("/briefing")
public class PubOpinionBriefingController {

    @Autowired
    private PubOpinionBriefingService PubOpinionBriefingService;

    @ApiOperation("简报推送应答")
    @PostMapping("/answer")
    public PubOpinionBriefingOutputDTO Answer(@RequestBody List<PubOpinionBriefing> list){
        PubOpinionBriefing breif = new PubOpinionBriefing();
        for (PubOpinionBriefing briefing : list) {
            String uuid = UUID.randomUUID().toString();
            breif.setId(uuid);
            breif.setCreatTime(new Timestamp(new Date().getTime()));
            breif.setPubInfoBriefReportID( briefing.getPubInfoBriefReportID());
            breif.setPubInfoBriefReportSendTime( briefing.getPubInfoBriefReportSendTime());
            breif.setPubInfoBriefReportType( briefing.getPubInfoBriefReportType());
            breif.setPubInfoBriefReportWriteTime( briefing.getPubInfoBriefReportWriteTime());
            breif.setPubInfoFileContent(briefing.getPubInfoFileContent());
            breif.setPubInfoFileLength(briefing.getPubInfoFileLength());
            breif.setPubInfoFileName(briefing.getPubInfoFileName());
        }
        try {
            String s = PubOpinionBriefingService.get(breif.getPubInfoBriefReportID());
            //为空，不存在，可以保存
            if(s == null||s ==""){
                PubOpinionBriefingService.insert(breif);
                //ArrayList<PubOpinionBriefingOutputDTO> obj = new ArrayList<>();
                PubOpinionBriefingOutputDTO dto = new PubOpinionBriefingOutputDTO();
                dto.setPubInfoTopicID(breif.getPubInfoBriefReportID());
                dto.setPubInfoFileName(breif.getPubInfoFileName());
                dto.setPlatCfgRslt("1:成功");
                return dto;
            }else {
                PubOpinionBriefingOutputDTO dto = new PubOpinionBriefingOutputDTO();
                dto.setPubInfoTopicID(breif.getPubInfoBriefReportID());
                dto.setPubInfoFileName(breif.getPubInfoFileName());
                dto.setPlatCfgRslt("2:失败");
                dto.setPlatInfoArea("重复接收");
                return dto;
            }
        }catch (Exception e) {
            PubOpinionBriefingOutputDTO dto = new PubOpinionBriefingOutputDTO();
            dto.setPubInfoTopicID(breif.getPubInfoBriefReportID());
            dto.setPubInfoFileName(breif.getPubInfoFileName());
            dto.setPlatCfgRslt("2:失败");
            dto.setPlatInfoArea("其他原因"+e.getMessage());
            return dto;
        }
    }


    @ApiOperation("查询最新的简报信息")
    @GetMapping("/data")
    @ResponseBody
    public PubOpinionBriefing Query(){
        PubOpinionBriefing query = PubOpinionBriefingService.query();
        return query;
    }
}
