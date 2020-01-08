package com.hw.sentiment.controller;

import cn.hutool.http.HttpUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ymy
 * @date 2019/12/16
 * @description 舆情数量预测、时间序列预测、舆情预警
 */
@Api(tags = "SentimentController",description = "舆情数量预测、时间序列预测、舆情预警")
@RestController
@RequestMapping("/opinion")
public class SentimentController {

    @ApiOperation("舆情最终数量预测")
    @PostMapping("/preNum")
    @ResponseBody
    public Integer PredictNum(Map<String,Object> paramMap){

//        HashMap<String, Object> map = new HashMap<>();
//        String predictTimeHawkes = String.valueOf(paramMap.get("PredictTimeHawkes"));
//        map.put("PredictTimeHawkes",predictTimeHawkes);

//        String eventRetweetTime = String.valueOf(paramMap.get("EventRetweetTime"));
//        JSONArray eventRetweetTimeJson = JSONArray.parseArray(eventRetweetTime);

        String url = "";
        String s = HttpUtil.get(url, paramMap);
        System.out.println("111"+s);
        Integer i = Integer.parseInt(s);
        return i;
    }

    @ApiOperation("舆情时间序列预测")
    @GetMapping("/preTime")
    @ResponseBody
    public ArrayList<Integer> PredictTime(HashMap<String,Object>paramMap){

        /*HashMap<String, Object> map = new HashMap<>();
        Integer EventRetweetCount =Integer.parseInt(request.getParameter("EventRetweetCount")) ;
        String TimeInterval = request.getParameter("TimeInterval");
        String PredictTimeArima = request.getParameter("PredictTimeArima");
        map.put("EventRetweetCount",EventRetweetCount);
        map.put("TimeInterval",TimeInterval);
        map.put("PredictTimeArima",PredictTimeArima);*/

        String url = "";
        String s = HttpUtil.get(url, paramMap);


        return null;
    }

    @ApiOperation("舆情预警")
    @GetMapping("/warning")
    @ResponseBody
    public Character Warning(HashMap<String,Object>map){

        ArrayList<Object> list = new ArrayList<>();
        for (Object value : map.values()) {
            if(value instanceof Map){
                list.add(value);
            }
            list.add(value);
        }
        return null;
    }
}
