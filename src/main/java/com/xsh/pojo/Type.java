package com.xsh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: wangxiaobo
 * @create: 2021-02-27 15:49
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Type {
    private Long id;
    private String name;

    private List<Blog> blogs = new ArrayList<> ();
}
