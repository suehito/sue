package com.sutao.service;

import com.sutao.entity.UserEntity;

import java.util.List;

/**
 * Created by sue on 2018/4/20.
 */
public interface UserService {

    UserEntity getUser(String userName,String passWord);

    void insertUser(String userName,String passWord);

    List<UserEntity> getUsers(String userName);
}
