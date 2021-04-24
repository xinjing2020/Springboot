package com.xsh.service;

import com.xsh.pojo.Tag;

import java.util.List;

/**
 * @author: wangxiaobo
 * @create: 2021-02-27 15:57
 **/
public interface TagServic {
    int saveTag(Tag tag);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    List<Tag> getAllTag();

    List<Tag> getBlogTag();  //首页展示博客标签

    List<Tag> getTagByString(String text);   //从字符串中获取tag集合

    int updateTag(Tag tag);

    int deleteTag(Long id);

}
