package com.hw.sentiment.controller;

import com.hw.sentiment.domain.*;
import com.hw.sentiment.dto.*;
import com.hw.sentiment.service.*;
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
 * @date 2019/12/18
 * @description 实时舆情事件信息通知
 */
@Api(tags = "SentimentInfoNoticeController", description = "实时舆情事件信息通知")
@RestController
@RequestMapping("/notice")
public class SentimentInfoNoticeController {

    @Autowired
    private EventInfoNoticeService eventInfoNoticeService;
    @Autowired
    private PublicSentimentInfoService publicSentimentInfoService;
    @Autowired
    private PubInfoFileService pubInfoFileService;
    @Autowired
    private PubInfoDepartmentService pubInfoDepartmentService;
    @Autowired
    private PubInfoDepartmentWorkService pubInfoDepartmentWorkService;

    @ApiOperation("实时舆情事件信息通知")
    @PostMapping("/publicSentimentInfo")
    public List<SentimentInfoResultOutputDTO> PublicSentimentInfo(@RequestBody List<EventInfoNoticeInputDTO> list) {
        EventInfoNotice eventInfoNotice = new EventInfoNotice();
        PublicSentimentInfo info = new PublicSentimentInfo();
        PubInfoFile file = new PubInfoFile();
        PubInfoDepartment dept = new PubInfoDepartment();
        PubInfoDepartmentWork work = new PubInfoDepartmentWork();
        //总的集合
        for (EventInfoNoticeInputDTO eventInfoNoticeInputDTO : list) {
            String uuid = UUID.randomUUID().toString();
            List<PublicSentimentInfoInputDTO> publicSentimentInfoArea = eventInfoNoticeInputDTO.getPublicSentimentInfoArea();
            eventInfoNotice.setId(uuid);
            eventInfoNotice.setOperateTime(new Timestamp(new Date().getTime()));
            eventInfoNotice.setPubInfoCaseJudgeName(eventInfoNoticeInputDTO.getPubInfoCaseJudgeName());
            eventInfoNotice.setPubInfoCaseName(eventInfoNoticeInputDTO.getPubInfoCaseName());
            eventInfoNotice.setPubInfoSendType(eventInfoNoticeInputDTO.getPubInfoSendType());
            eventInfoNotice.setPubInfoSerialNum(eventInfoNoticeInputDTO.getPubInfoSerialNum());
            eventInfoNotice.setPublicSentimentInfoNum(eventInfoNoticeInputDTO.getPublicSentimentInfoNum());
            //信息区
            for (PublicSentimentInfoInputDTO publicSentimentInfoInputDTO : publicSentimentInfoArea) {
                String uuid1 = UUID.randomUUID().toString();
                List<PubInfoFileInputDTO> pubInfoFileArea = publicSentimentInfoInputDTO.getPubInfoFileInputDTOArea();
                List<PubInfoDepartmentInputDTO> pubInfoDepartmentArea = publicSentimentInfoInputDTO.getPubInfoDepartmentInputDTOArea();
                List<PubInfoDepartmentWorkInputDTO> pubInfoDepartmentWorkInputDTOArea = publicSentimentInfoInputDTO.getPubInfoDepartmentWorkInputDTOArea();
                info.setId(uuid1);
                info.setEid(uuid);
                info.setPubInfoContent(publicSentimentInfoInputDTO.getPubInfoContent());
                info.setPubInfoCorType(publicSentimentInfoInputDTO.getPubInfoCorType());
                info.setPubInfoDepartmentNum(publicSentimentInfoInputDTO.getPubInfoDepartmentNum());
                info.setPubInfoDepartmentWorkNum(publicSentimentInfoInputDTO.getPubInfoDepartmentWorkNum());
                info.setPubInfoFileNum(publicSentimentInfoInputDTO.getPubInfoFileNum());
                info.setPubInfoForwardNum(publicSentimentInfoInputDTO.getPubInfoForwardNum());
                info.setPubInfoID(publicSentimentInfoInputDTO.getPubInfoID());
                info.setPubInfoSrcNetizenName(publicSentimentInfoInputDTO.getPubInfoSrcNetizenName());
                info.setPubInfoSrcType(publicSentimentInfoInputDTO.getPubInfoSrcType());
                info.setPubInfoSrcWebsiteLink(publicSentimentInfoInputDTO.getPubInfoSrcWebsiteLink());
                info.setPubInfoSrcWebsiteName(publicSentimentInfoInputDTO.getPubInfoSrcWebsiteName());
                info.setPubInfoTime(publicSentimentInfoInputDTO.getPubInfoTime());
                info.setPubInfoTitile(publicSentimentInfoInputDTO.getPubInfoTitile());
                //信息区包含的对象
                for (PubInfoFileInputDTO pubInfoFile : pubInfoFileArea) {
                    String uuid2 = UUID.randomUUID().toString();
                    file.setId(uuid2);
                    file.setFid(uuid1);
                    file.setPubInfoFileContent(pubInfoFile.getPubInfoFileContent());
                    file.setPubInfoFileID(pubInfoFile.getPubInfoFileID());
                    file.setPubInfoFileLength(pubInfoFile.getPubInfoFileLength());
                    file.setPubInfoFileName(pubInfoFile.getPubInfoFileName());
                    file.setPubInfoFileType(pubInfoFile.getPubInfoFileType());
                }
                for (PubInfoDepartmentInputDTO pubInfoDepartment : pubInfoDepartmentArea) {
                    String uuid3 = UUID.randomUUID().toString();
                    dept.setId(uuid3);
                    dept.setPid(uuid1);
                    dept.setPubInfoDepartmentLevel(pubInfoDepartment.getPubInfoDepartmentLevel());
                    dept.setPubInfoDepartmentArea(pubInfoDepartment.getPubInfoDepartmentArea());
                    dept.setPubInfoDepartmentName(pubInfoDepartment.getPubInfoDepartmentName());
                    dept.setPubInfoDepartmentType(pubInfoDepartment.getPubInfoDepartmentType());
                    dept.setPubInfoDepCity(pubInfoDepartment.getPubInfoDepCity());
                    dept.setPubInfoDepProvince(pubInfoDepartment.getPubInfoDepProvince());
                }
                for (PubInfoDepartmentWorkInputDTO workInputDTO : pubInfoDepartmentWorkInputDTOArea) {
                    String uuid4 = UUID.randomUUID().toString();
                    work.setId(uuid4);
                    work.setWid(uuid1);
                    work.setPubInfoDepartmentWorkContent(workInputDTO.getPubInfoDepartmentWorkContent());
                    work.setPubInfoDepartmentWorkType(workInputDTO.getPubInfoDepartmentWorkType());
                }
            }
        }
        try {
            String s = publicSentimentInfoService.get(info.getPubInfoID());
            if (s == null || s == "") {
                eventInfoNoticeService.insert(eventInfoNotice);
                publicSentimentInfoService.insert(info);
                pubInfoFileService.insert(file);
                pubInfoDepartmentService.insert(dept);
                pubInfoDepartmentWorkService.insert(work);
                //返回的接收状态信息
                List<SentimentInfoResultOutputDTO> obj = new ArrayList<>();
                List<PublicSentimentGetInfoOutputDTO> objects = new ArrayList<>();
                SentimentInfoResultOutputDTO dto = new SentimentInfoResultOutputDTO();
                dto.setPublicSentimentInfoNum(eventInfoNotice.getPublicSentimentInfoNum());
                PublicSentimentGetInfoOutputDTO dto2 = new PublicSentimentGetInfoOutputDTO();
                dto2.setPubInfoID(info.getPubInfoID());
                dto2.setPlatCfgRslt("1;成功");
                objects.add(dto2);
                dto.setPublicSentimentIGetInfoArea(objects);
                obj.add(dto);
                System.out.println("obj:" + obj);
                return obj;
            } else {
                List<SentimentInfoResultOutputDTO> obj = new ArrayList<>();
                List<PublicSentimentGetInfoOutputDTO> objects = new ArrayList<>();
                SentimentInfoResultOutputDTO dto = new SentimentInfoResultOutputDTO();
                dto.setPublicSentimentInfoNum(eventInfoNotice.getPublicSentimentInfoNum());
                PublicSentimentGetInfoOutputDTO dto2 = new PublicSentimentGetInfoOutputDTO();
                dto2.setPubInfoID(info.getPubInfoID());
                dto2.setPlatCfgRslt("2:失败");
                dto2.setPlatInfoArea("重复接收");
                objects.add(dto2);
                dto.setPublicSentimentIGetInfoArea(objects);
                obj.add(dto);
                System.out.println("obj:" + obj);
                return obj;
            }
        } catch (Exception e) {
            List<SentimentInfoResultOutputDTO> obj = new ArrayList<>();
            List<PublicSentimentGetInfoOutputDTO> objects = new ArrayList<>();
            SentimentInfoResultOutputDTO dto = new SentimentInfoResultOutputDTO();
            dto.setPublicSentimentInfoNum(eventInfoNotice.getPublicSentimentInfoNum());
            PublicSentimentGetInfoOutputDTO dto2 = new PublicSentimentGetInfoOutputDTO();
            dto2.setPubInfoID(info.getPubInfoID());
            dto2.setPlatCfgRslt("2:失败");
            dto2.setPlatInfoArea("其他原因" + e.getMessage());
            objects.add(dto2);
            dto.setPublicSentimentIGetInfoArea(objects);
            obj.add(dto);
            System.out.println("obj:" + obj);
            return obj;
        }
    }

    @ApiOperation("查询数据，前端展示")
    @GetMapping("/data")
    @ResponseBody
    public EventInfoNotice Query() {
        EventInfoNotice query = eventInfoNoticeService.query();
        return query;
    }
}

