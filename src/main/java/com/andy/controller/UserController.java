package com.andy.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "用户管理相关接口")
@RequestMapping("/user")
public class UserController {

    @ApiOperation("用户登录")
    @GetMapping("/login")
    public String login() {
        return "登录成功!!!!";
    }

}

