package com.xsh.mapper;

import com.xsh.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author: wangxiaobo
 * @create: 2021-02-27 00:01
 **/
@Repository
public interface UserMapper extends Mapper<User> {
    User findByUsernameAndPassword(@Param("username") String username);
}
