package com.demo.controllers;

import com.demo.config.ReadConfiguration;
import com.demo.entity.TUser;
import com.demo.mapper.TUserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;

@RestController
public class LoginController {
    @Resource
    private TUserMapper mapper;
    @Resource
    private ReadConfiguration data;

    @RequestMapping("/login")
    public String login() throws  Exception{
        TUser user = new TUser();
        user.setUserName("alex");
        user.setUserPassword("xf123456");
        user.setUserGender("男");
        user.setOperTime(new Timestamp(System.currentTimeMillis()));
        user.setUserInTime(new Date());
        mapper.addUser(user);
        return "success!";
    }

    @RequestMapping("/getuser")
    public TUser getUserById(Integer userId) throws Exception{
        TUser userInfo = mapper.queryUserById(userId);
        System.out.println(userInfo.getUserName());
        return userInfo;
    }

    @RequestMapping("/getdata")
    public ReadConfiguration getData(){
        System.out.println(data.getName());
        return data;
    }
}
