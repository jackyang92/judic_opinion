package com.hw.sentiment.dto;

import lombok.Data;

import java.util.List;


@Data
public class LevelOutDTO {
    private String ID;
    private String statu;
    private String Name;
    private List<History> history;
    private List<Prediction> prediction;
}
