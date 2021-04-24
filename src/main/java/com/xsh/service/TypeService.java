package com.xsh.service;

import com.xsh.pojo.Type;

import java.util.List;

/**
 * @author: wangxiaobo
 * @create: 2021-02-27 18:29
 **/
public interface TypeService {
    int saveType(Type type);

    Type getType(Long id);

    Type getTypeByName(String name);

    List<Type> getAllType();

    List<Type> getBlogType();  //首页右侧展示type对应的博客数量

    int updateType(Type type);

    int deleteType(Long id);
}
