package com.liuyang.signin.server;

import com.liuyang.signin.enity.User;
import com.liuyang.signin.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServer {

    @Resource
    private UserMapper userMapper;

    public Boolean Login(User user){
        User user1 = userMapper.login(user);
        return (user1 != null);
    }
}
