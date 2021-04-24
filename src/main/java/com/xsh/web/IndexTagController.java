package com.xsh.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xsh.pojo.Blog;
import com.xsh.pojo.Tag;
import com.xsh.pojo.Type;
import com.xsh.service.BlogService;
import com.xsh.service.TagServic;
import com.xsh.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author: wangxiaobo
 * @create: 2021-02-27 16:40
 **/
@Controller
public class IndexTagController {
    @Autowired
    BlogService blogService;
    @Autowired
    TagServic tagService;
    @Autowired
    TypeService typeService;

    @GetMapping("/")
    public String toIndex(Model model,
                          @RequestParam(required = false, defaultValue = "1", value = "pageNum") int pageNum) {
        PageHelper.startPage (pageNum, 8);
        List<Blog> allBlog = blogService.getIndexBlog ();
        List<Type> allType = typeService.getBlogType ();  //获取博客的类型(联表查询)
        List<Tag> allTag = tagService.getBlogTag ();  //获取博客的标签(联表查询)
        List<Blog> recommendBlog = blogService.getAllRecommendBlog ();  //获取推荐博客
        //得到分页结果对象
        PageInfo pageInfo = new PageInfo (allBlog);
        model.addAttribute ("pageInfo", pageInfo);
        model.addAttribute ("tags", allTag);
        model.addAttribute ("types", allType);
        model.addAttribute ("recommendBlogs", recommendBlog);
        return "index";
    }

    @PostMapping("/search")
    public String search(@RequestParam(required = false, defaultValue = "1", value = "pageNum") int pageNum,
                         @RequestParam String query, Model model) {

        PageHelper.startPage (pageNum, 5);
        List<Blog> searchBlog = blogService.getSearchBlog (query);
        //得到分页结果对象
        PageInfo pageInfo = new PageInfo (searchBlog);
        model.addAttribute ("pageInfo", pageInfo);
        model.addAttribute ("query", query);
        return "search";
    }

    @PostMapping("/blog/{id}")
    public String toLogin(@PathVariable Long id, Model model) {
        Blog blog = blogService.getDetailedBlog (id);
        model.addAttribute ("blog ", blog);
        return "blog ";
    }
}
