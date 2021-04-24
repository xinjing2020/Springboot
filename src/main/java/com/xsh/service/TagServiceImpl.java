package com.xsh.service;


import com.xsh.mapper.TagMapper;
import com.xsh.pojo.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author: wangxiaobo
 * @create: 2021-02-27 16:37
 **/
@Service
public class TagServiceImpl implements TagServic {
    @Autowired
    TagMapper tagDao;

    @Override
    public int saveTag(Tag tag) {
        return 0;
    }

    @Override
    public Tag getTag(Long id) {
        return null;
    }

    @Override
    public Tag getTagByName(String name) {
        return null;
    }

    @Override
    public List<Tag> getAllTag() {
        return tagDao.getAllTag ();
    }

    @Override
    public List<Tag> getBlogTag() {
        return tagDao.getBlogTag ();
    }

    @Override
    public List<Tag> getTagByString(String text) {
        return null;
    }

    @Override
    public int updateTag(Tag tag) {
        return 0;
    }

    @Override
    public int deleteTag(Long id) {
        return 0;
    }
}
