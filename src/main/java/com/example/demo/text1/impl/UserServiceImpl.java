package com.example.demo.text1.impl;

import com.example.demo.text1.bean.UserBean;
import com.example.demo.text1.serv.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserBean getUserInfo() {
        UserBean user=new UserBean();
        user.setUserName("TomCan");
        user.setPassword("123456");
        user.setPhoneNumber("17800000000");
        return user;
    }
}
