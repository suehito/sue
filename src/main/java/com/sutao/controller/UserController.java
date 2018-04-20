package com.sutao.controller;

import com.sutao.entity.UserEntity;
import com.sutao.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sue on 2018/4/18.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource(name = "userServiceImpl")
    private UserService userService;
    @GetMapping("/login")
    public String loginUser(String userName,String passWord){
        UserEntity userEntity = userService.getUser(userName,passWord);
        if(userEntity != null){
            return userEntity.toString();
        }else {
            return "Fail";
        }
    }

    @PostMapping("/register")
    public String registerUser(String userName,String passWord){
        userService.insertUser(userName,passWord);
        return "register OK";
    }

    @GetMapping("/getUsers")
    public String getUsers(String userName){
        List<UserEntity> userEntities = userService.getUsers(userName);
        StringBuilder stringBuilder = new StringBuilder();
        for (UserEntity userEntiry:userEntities
             ) {
            stringBuilder.append("\n"+userEntiry.toString());
        }
        return stringBuilder.toString();
    }
}
