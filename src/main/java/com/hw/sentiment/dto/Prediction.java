package com.hw.sentiment.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author ymy
 * @date 2020/1/6
 * @description 描述信息
 */
@Data
public class Prediction {
    private String time;
    private String value;
}
