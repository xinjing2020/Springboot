package com.xsh.web.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xsh.pojo.Blog;
import com.xsh.service.BlogService;
import com.xsh.service.TagServic;
import com.xsh.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author: wangxiaobo
 * @create: 2021-02-28 16:52
 **/
@Controller
@RequestMapping("/admin")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @Autowired
    private TypeService typeService;

    @Autowired
    private TagServic tagService;

    public void setTypeAndTag(Model model) {
        model.addAttribute ("types", typeService.getAllType ());
        model.addAttribute ("tags", tagService.getAllTag ());
    }

    @GetMapping("/blogs")//后台显示博客列表
    public String blogs(@RequestParam(required = false, defaultValue = "1", value = "pagenum") int pagenum, Model model) {
        PageHelper.startPage (pagenum, 5);
        List<Blog> allBlog = blogService.getAllBlog ();
        //得到分页结果对象
        PageInfo pageInfo = new PageInfo (allBlog);
        model.addAttribute ("pageInfo", pageInfo);
        setTypeAndTag (model);  //查询类型和标签
        return "admin/blogs";
    }

    @PostMapping("/blogs/search")//按条件查询博客
    public String searchBlogs(Blog blog, @RequestParam(required = false, defaultValue = "1", value = "pagenum")
            int pagenum, Model model) {
        PageHelper.startPage (pagenum, 5);
        List<Blog> allBlog = blogService.searchAllBlog (blog);
        //得到分页结果对象
        PageInfo pageInfo = new PageInfo (allBlog);
        model.addAttribute ("pageInfo", pageInfo);
        model.addAttribute ("message", "查询成功");
        setTypeAndTag (model);
        return "admin/blogs"; //返回admin/blogs页面下的一个片段blogList,实现局部刷新
    }
}
