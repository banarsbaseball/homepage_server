package com.example.sample.controller;

import com.example.sample.entity.UserEntity;
import com.example.sample.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getUser")
    @Operation(summary = "ユーザ情報一覧取得")
    List<UserEntity> getUser() {
        return userService.getAccount();
    }
}
