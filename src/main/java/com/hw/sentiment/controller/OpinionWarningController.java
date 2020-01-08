package com.hw.sentiment.controller;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hw.sentiment.dto.History;
import com.hw.sentiment.dto.LevelOutDTO;
import com.hw.sentiment.dto.Prediction;
import com.hw.sentiment.dto.ResultList;
import com.hw.sentiment.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@Api(tags = "OpinionWarningController",description = "新舆情预警")
@RestController
@RequestMapping("/opinion")
public class OpinionWarningController {

    @ApiOperation("舆情预警等级以及事件名称")
    @GetMapping("/warn")
    @ResponseBody
    public String Warning() {
        String url = "http://192.168.20.63:8080/getResultJson/getNews";
        String s = HttpUtil.get(url);
        return s;
    }
}



