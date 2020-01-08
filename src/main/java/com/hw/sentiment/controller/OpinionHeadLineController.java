package com.hw.sentiment.controller;

import cn.hutool.http.HttpUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ymy
 * @date 2020/1/6
 * @description 舆情头条信息
 */
@Api(tags = "OpinionHeadLineController",description = "新舆情头条信息")
@RestController
@RequestMapping("/headline")
public class OpinionHeadLineController {

    @ApiOperation("新舆情头条信息")
    @GetMapping("/event")
    @ResponseBody
    public String Event(){
        String url = "http://28502539l0.eicp.vip/get_all";//头条信息

        String s = HttpUtil.get(url);
        System.out.println(s);



        /*JSONObject object = JSON.parseObject(s);
        String result = object.getString("result");
        JSON.parseObject()*/
        return s;
    }

}
