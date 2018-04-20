package com.sutao.service.impl;

import com.sutao.dao.UserDao;
import com.sutao.entity.UserEntity;
import com.sutao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sue on 2018/4/20.
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public UserEntity getUser(String userName, String passWord) {
        return userDao.getUser(userName,passWord);
    }

    @Override
    @Transactional
    public void insertUser(String userName, String passWord) {
        userDao.insertUser(userName,passWord);
    }

    @Override
    public List<UserEntity> getUsers(String userName) {
        return userDao.getUsers(userName);
    }
}
