package com.hw.sentiment.controller;

import com.hw.sentiment.response.ResponseResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ymy
 * @date 2019/12/25
 * @description 司法舆情发展趋势预测信息
 */
@Api(tags = "DevelopmentTrendForcastInfoController",description = "司法舆情发展趋势预测信息")
@RestController
@RequestMapping("/trend")
public class DevelopmentTrendForcastInfoController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/topic")
    @ResponseBody
    public ResponseResult Forcast(@RequestBody String pubInfoTopicID){
        String url = "";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HashMap<String, Object> map = new HashMap<>();
        map.put("pubInfoTopicID",pubInfoTopicID);
        HttpEntity<String> entity = new HttpEntity<>(null,headers);
        ResponseEntity<Map> response = null;
        try {
            response = restTemplate.exchange(url+"?pubInfoTopicID={pubInfoTopicID}", HttpMethod.GET, entity, Map.class, map);
        }catch (RestClientException e) {
            return new ResponseResult(0,"获取法舆情发展趋势预测信息失败"+e.getMessage());
        }
        return new ResponseResult(200,"成功",response.getBody());
    }
}
