package com.xsh.service;

import com.xsh.mapper.UserMapper;
import com.xsh.pojo.User;

import com.xsh.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: wangxiaobo
 * @create: 2021-02-23 00:40
 **/
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserMapper userMapper;

    @Override
    public User checkUser(String username, String password) {
        //    User user = userRepository.findByUsernameAndPassword (username, MD5Utils.code (password));
        User user = userMapper.findByUsernameAndPassword (username);

        return user == null ? null : user.getPassword ().equals (MD5Utils.code (password)) ? user : null;
    }
}
