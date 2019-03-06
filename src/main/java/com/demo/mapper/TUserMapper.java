package com.demo.mapper;

import com.demo.entity.TUser;
import org.apache.ibatis.annotations.*;

public interface TUserMapper {
    @Insert("insert into t_demo_user(user_name,user_password,user_gender,user_in_time,oper_time) " +
            "values(#{userName},#{userPassword},#{userGender},#{userInTime},#{operTime})")
    public void addUser(TUser user) throws  Exception;

   /* @Results(id = "userResults", value = {
            @Result(property = "userId", column = "user_id", id = true),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "userPassword", column = "user_password"),
            @Result(property = "userGender", column = "user_gender"),
            @Result(property = "userInTime", column = "user_in_time"),
            @Result(property = "operTime", column = "oper_time"),
    })
    @Select("select * from t_demo_user where user_id=#{userId}")*/
    public  TUser queryUserById(Integer userId) throws  Exception;
}
