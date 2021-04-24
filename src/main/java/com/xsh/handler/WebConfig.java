package com.xsh.handler;

import com.xsh.interceptor.LoginInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author: wangxiaobo
 * @create: 2021-02-27 01:23
 * 前端页面提交 初步功能包括bean，登录拦截，登录等功能的完成 以及博客的分类功能的完成
 **/
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor (new LoginInterceptor ())
                .addPathPatterns ("/admin/**")
                .excludePathPatterns ("/admin")
                .excludePathPatterns ("/admin/login");
    }
}
