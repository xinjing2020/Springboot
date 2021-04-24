package com.xsh.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: wangxiaobo
 * @create: 2021-02-27 01:19
 * 前端页面提交 初步功能包括bean，登录拦截，登录等功能的完成 以及博客的分类功能的完成
 **/
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession ().getAttribute ("user") == null) {
            response.sendRedirect ("/admin");
            return false;
        }
        return true;
    }
}
