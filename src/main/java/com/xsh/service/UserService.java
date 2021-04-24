package com.xsh.service;

import com.xsh.pojo.User;

/**
 * @author: wangxiaobo
 * @create: 2021-02-23 00:35
 **/
public interface UserService {
    public User checkUser(String username, String password);
}
