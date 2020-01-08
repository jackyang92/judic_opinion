package com.hw.sentiment.domain;

import lombok.Data;

/**
 * @author ymy
 * @date 2019/12/25
 * @description 司法舆情实时预警信息通知
 */
@Data
public class RealTimeWarningNotice {
    private String PubInfoTopicID;//舆情话题标识
    private String Time;//时段
    private Float NumUser;//网民关注数量
    private Float Publisher_Influence;//发布者影响力
    private Float Num_Releases;//主题发布数量
    private Float Rate_Releases;//主题发布数量变化率
    private Float ThemeHits;//主题点击数
    private Float Rate_Hits;//主题点击变化率
    private Float ThemeReprint;//主题转载量
    private Float Rate_Reprint;//主题转载量变化率
    private Float TopicComments;//主题评论量
    private Float Rate_Comments;//主题评论量变化率
    private Float SourceAuthority;//来源权威度
    private Float PublicOpinionSignature;//舆情署名度
    private Float ThemeContentTendency;//主题内容倾向
    private Float Num_DiffusionArea;//扩散地市数
    private Float Rate_Flow;//流量变化率
    private Float Rate_DiffusionStations;//扩散站点数量变化率
    private String WarningLevel;//预警级别

}
