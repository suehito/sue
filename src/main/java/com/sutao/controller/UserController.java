package com.sutao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sue on 2018/4/18.
 */
@RestController
public class UserController {
    @GetMapping("/user")
    public String getUser(String userName){
        return "sutao";

    }
}
