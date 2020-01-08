package com.hw.sentiment.controller;

import cn.hutool.http.HttpUtil;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ymy
 * @date 2020/1/6
 * @description 法检司图数据
 */
@Api(tags = "OpinionLegalController",description = "法检司图数据")
@RestController
@RequestMapping("/opinion")
public class OpinionLegalController {


    @GetMapping("/legal")
    @ResponseBody
    public String Legal(){
        String url = "http://28502539l0.eicp.vip/get_all";
        String s = HttpUtil.get(url);
        //System.out.println(s);
        return s;
    }
}

