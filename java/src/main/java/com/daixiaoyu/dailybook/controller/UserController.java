package com.daixiaoyu.dailybook.controller;

import com.daixiaoyu.dailybook.common.RestResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @program: java
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-10-13 14:24
 **/
@RestController
public class UserController {
    @PostMapping("/login")
    public RestResult loing(HttpServletResponse response){
        response.setHeader("Authorization", "token");
        response.setHeader("Access-Control-Expose-Headers", "Authorization");
        System.out.println("我被调用了");
        return RestResult.success();
    }
}
