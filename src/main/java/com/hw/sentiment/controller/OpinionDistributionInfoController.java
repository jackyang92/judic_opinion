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
 * @description 舆情热力分布图
 */
@Api(tags = "OpinionDistributionInfoController",description = "新舆情热力分布图")
@RestController
@RequestMapping("/opinion")
public class OpinionDistributionInfoController {

    @ApiOperation("新舆情热力分布图")
    @GetMapping("/province")
    @ResponseBody
    public String Province(){
        String url = "http://z939837962.yicp.top/get_province";
        String s = HttpUtil.get(url);
        //System.out.println(s);
        return s;

    }

}
