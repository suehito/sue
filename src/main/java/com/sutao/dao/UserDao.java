package com.sutao.dao;

import com.sutao.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by sue on 2018/4/20.
 */
@Mapper
@Component
public interface UserDao {

    @Select("select * from t_user where username = #{userName} and password = #{passWord}")
     UserEntity getUser(@Param("userName") String userName,@Param("passWord") String passWord);

    @Insert("insert into t_user (username,password) values (#{userName},#{passWord})")
    void insertUser(@Param("userName") String userName,@Param("passWord") String passWord);

    @Select("select * from t_user where username = #{userName}")
    List<UserEntity> getUsers(@Param("userName") String userName);
}
