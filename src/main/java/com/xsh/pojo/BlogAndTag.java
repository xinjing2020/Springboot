package com.xsh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: wangxiaobo
 * @create: 2021-02-27 23:12
 * 把博客和标签关系存到数据库中使用的类
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogAndTag {
    private Long tagId;

    private Long blogId;

}
