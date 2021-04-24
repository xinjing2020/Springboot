package com.xsh.service;

import com.xsh.mapper.TypeDao;
import com.xsh.pojo.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author: wangxiaobo
 * @create: 2021-02-27 18:31
 **/
@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeDao typeDao;

    //事务注解
    @Transactional
    @Override
    public int saveType(Type type) {
        return 0;
    }

    @Override
    public Type getType(Long id) {
        return null;
    }

    @Override
    public Type getTypeByName(String name) {
        return null;
    }

    @Override
    public List<Type> getAllType() {
        return typeDao.getAllType ();
    }

    @Override
    public List<Type> getBlogType() {
        return typeDao.getBlogType ();
    }

    @Override
    public int updateType(Type type) {
        return 0;
    }

    @Override
    public int deleteType(Long id) {
        return 0;
    }
}
