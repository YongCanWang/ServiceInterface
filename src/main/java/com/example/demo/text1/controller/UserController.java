package com.example.demo.text1.controller;

import com.example.demo.text1.bean.UserBean;
import com.example.demo.text1.serv.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    final
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    public String getUserInfo() {
        UserBean user = userService.getUserInfo();
        return user.toString();
    }
}

