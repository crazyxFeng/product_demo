package com.demo.entity;

import java.util.Date;
import java.sql.Timestamp;

public class TUser {
    private Integer userId; //用户ID
    private String userName;//用户名
    private String userPassword; //用户密码
    private String userGender; //性别
    private Date userInTime; //入职时间
    private Timestamp operTime; //操作时间

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public Date getUserInTime() {
        return userInTime;
    }

    public void setUserInTime(Date userInTime) {
        this.userInTime = userInTime;
    }

    public Timestamp getOperTime() {
        return operTime;
    }

    public void setOperTime(Timestamp operTime) {
        this.operTime = operTime;
    }



}
