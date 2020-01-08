package com.hw.sentiment.controller;

import cn.hutool.http.HttpUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ymy
 * @date 2020/1/6
 * @description 舆情预测信息
 */
@Api(tags = "OpinionForecastInfoController",description = "新舆情预测信息")
@RestController
@RequestMapping("/opinion")
public class OpinionForecastInfoController {

    @ApiOperation("新舆情预测信息")
    @GetMapping("forecast")
    @ResponseBody
    public String Forecast(){
        String url = "";
        String s = HttpUtil.get(url);
        //System.out.println(s);
        return s;

    }
}
