package com.example.sample.controller;

import com.example.sample.entity.UserEntity;
import com.example.sample.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user/getUser")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    List<UserEntity> getTweet() {
        return userService.getAccount();
    }
}
