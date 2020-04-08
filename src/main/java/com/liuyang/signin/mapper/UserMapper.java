package com.liuyang.signin.mapper;

import com.liuyang.signin.enity.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select*from user where user_name = #{userName} and password = #{password}")
    User login(User user);
}
