package com.whl.Service.impl;

import com.whl.Service.UserService;
import com.whl.dao.UserDao;
import com.whl.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Cacheable(cacheNames = "authority", key = "#username")
    @Override
    public SysUser getUserByName(String username) {
        return userDao.selectByName(username);
    }
}