package com.hw.sentiment.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author ymy
 * @date 2020/1/6
 * @description 服务器跨域配置
 */
/**
 * 跨域请求配置
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")    //允许任何域名使用
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")  //允许任何方法（post、get等）
                .maxAge(3600)
                .allowCredentials(true);
    }
}

