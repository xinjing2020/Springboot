package com.xsh.mapper;

import com.xsh.pojo.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: wangxiaobo
 * @create: 2021-02-27 16:37
 **/
@Mapper
@Repository
public interface TagMapper {
    int saveTag(Tag tag);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    List<Tag> getAllTag();

    List<Tag> getBlogTag();  //首页展示博客标签

    int updateTag(Tag tag);

    int deleteTag(Long id);

}
