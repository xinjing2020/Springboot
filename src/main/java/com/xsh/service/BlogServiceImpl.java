package com.xsh.service;

import com.xsh.exception.NotFoundException;
import com.xsh.mapper.BlogMapper;
import com.xsh.mapper.TypeDao;
import com.xsh.pojo.Blog;
import com.xsh.util.MarkdownUtils;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: wangxiaobo
 * @create: 2021-02-27 15:58
 **/
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogMapper blogMapper;

    @Autowired
    TypeDao typeDao;

    @Override
    public Blog getBlog(Long id) {
        return blogMapper.getBlog (id);
    }

    @Override
    public Blog getDetailedBlog(Long id) {
        Blog blog = blogMapper.getDetailedBlog (id);
        if (blog == null) {
            throw new NotFoundException ("该博客不存在");
        }
        String content = blog.getContent ();
        blog.setContent (MarkdownUtils.markdownToHtmlExtensions (content)); //将Markdown格式转换成html
        return blog;
    }

    /**
     * 后台展示博客
     *
     * @return
     */
    @Override
    public List<Blog> getAllBlog() {
        return blogMapper.getAllBlog ();
    }

    @Override
    public List<Blog> getByTypeId(Long typeId) {
        return null;
    }

    @Override
    public List<Blog> getByTagId(Long tagId) {
        return null;
    }

    @Override
    public List<Blog> getIndexBlog() {
        return blogMapper.getIndexBlog ();
    }

    @Override
    public List<Blog> getAllRecommendBlog() {
        return blogMapper.getAllRecommendBlog ();
    }

    @Override
    public List<Blog> getSearchBlog(String query) {
        return blogMapper.getSearchBlog (query);
    }

    @Override
    public Map<String, List<Blog>> archiveBlog() {
        return null;
    }

    @Override
    public int countBlog() {
        return 0;
    }

    @Override
    public int saveBlog(Blog blog) {
        return 0;
    }

    @Override
    public int updateBlog(Blog blog) {
        return 0;
    }

    @Override
    public int deleteBlog(Long id) {
        return 0;
    }

    @Override
    public List<Blog> searchAllBlog(Blog blog) {
        return blogMapper.searchAllBlog (blog);
    }
}
