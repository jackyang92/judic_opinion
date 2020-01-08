package com.hw.sentiment.controller;

import cn.hutool.http.HttpUtil;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ymy
 * @date 2019/12/23
 * @description 预测舆情的后续时间点信息区
 */
@Api(tags = "ForcastNextTimeInfoController",description = "预测舆情的后续时间点信息区")
@RestController
@RequestMapping("/forCastNextTimeInfo")
public class ForcastNextTimeInfoController {

    @GetMapping("/nextTimeInfo")
    @ResponseBody
    public String NextTimeInfo(){
        String url = "http://192.144.167.70:8080/getResultJson/active";
        String s = HttpUtil.get(url);
        return s;
    }
}
