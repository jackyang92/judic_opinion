package com.hw.sentiment.controller;

import cn.hutool.http.HttpUtil;
import com.hw.sentiment.domain.RealTimeWarningNotice;
import com.hw.sentiment.response.ResponseResult;
import com.hw.sentiment.service.RealTimeWarningNoticeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author ymy
 * @date 2019/12/25
 * @description 司法舆情实时预警信息通知和应答
 * <p>
 * 任务4调用应答接口，把数据传进来，保存到数据库，保存前先判断，成功则保存，否则返回异常
 * 前端调用接口，直接从数据库查询到该条记录
 */
@Api(tags = "RealTimeWarningNoticeController", description = "司法舆情实时预警信息通知和应答")
@RestController
@RequestMapping("/warning")
public class RealTimeWarningNoticeController {

   /* @Autowired
    private RealTimeWarningNoticeService realTimeWarningNoticeService;
*/
    @ApiOperation("司法舆情实时预警信息应答")
    @GetMapping("/response")
    @ResponseBody
    public String Notice() {
        String url = "http://192.168.20.63:8080/getResultJson/active";
        String s = HttpUtil.get(url);
        return s;
    }

    /*
    @ApiOperation("司法舆情实时预警信息应答")
    @PostMapping("/response")
    public ResponseResult Notice(@RequestBody List<RealTimeWarningNotice> list) {
        RealTimeWarningNotice notice = new RealTimeWarningNotice();
        for (RealTimeWarningNotice notice1 : list) {
            notice.setPubInfoTopicID(notice1.getPubInfoTopicID());//唯一标识
            notice.setThemeContentTendency(notice1.getThemeContentTendency());
            notice.setRate_Releases(notice1.getRate_Releases());
            notice.setThemeReprint(notice1.getThemeReprint());
            notice.setNum_DiffusionArea(notice1.getNum_DiffusionArea());
            notice.setNum_Releases(notice1.getNum_Releases());
            notice.setNumUser(notice1.getNumUser());
            notice.setPublicOpinionSignature(notice1.getPublicOpinionSignature());
            notice.setPublisher_Influence(notice1.getPublisher_Influence());
            notice.setRate_Comments(notice1.getRate_Comments());
            notice.setRate_DiffusionStations(notice1.getRate_DiffusionStations());
            notice.setRate_Flow(notice1.getRate_Flow());
            notice.setRate_Hits(notice1.getRate_Hits());
            notice.setRate_Reprint(notice1.getRate_Reprint());
            notice.setSourceAuthority(notice1.getSourceAuthority());
            notice.setThemeHits(notice1.getThemeHits());
            notice.setTopicComments(notice1.getTopicComments());
            notice.setWarningLevel( notice1.getWarningLevel());
            notice.setTime(notice1.getTime());
        }
        try {
            //保存前先查询是否存在
            String s = realTimeWarningNoticeService.get(notice.getPubInfoTopicID());
            //如果不存在，那么返回成功信息
            if (s == "" ||s ==null) {
                //插入数据库
                realTimeWarningNoticeService.insert(notice);
                //realTimeWarningNoticeService.query(notice.getPubInfoTopicID());
                return new ResponseResult(1, "成功");
            } else {//不为空，说明已经存在，重复接收了
                return new ResponseResult(2, "失败:重复接收");
            }
        } catch (Exception e) {
            return new ResponseResult(2, "失败:其他原因", e.getMessage());
        }
    }*/

    /*@ApiOperation("司法舆情实时预警信息通知")
    @GetMapping("/notice")
    @ResponseBody
    public RealTimeWarningNotice Query(String PubInfoTopicID) {

        return realTimeWarningNoticeService.query(PubInfoTopicID);
    }
*/

}
