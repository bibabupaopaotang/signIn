package com.liuyang.signin.server;

import com.liuyang.signin.enity.Response;
import com.liuyang.signin.enity.SignIn;
import com.liuyang.signin.enity.Team;
import com.liuyang.signin.mapper.SignMapper;
import com.liuyang.signin.mapper.TeamMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLOutput;

@Service
public class SignServer {

    @Resource
    private TeamMapper teamMapper;

    @Resource
    private SignMapper signMapper;

    public Response sign(SignIn signIn){
        String message = "";
        boolean b = false;
        if(signIn.getName()!=null && signIn.getCheckNum()!= null){
             Team t = teamMapper.getStatus(signIn);
             if(null == t){
                 message = "请输入正确的验证码";
             }else if(t.getStatus() == 0){
                 message = "签到已经结束";
             }else if(t != null && t.getStatus() == 1){
                 b  =  signMapper.insertSignUser(signIn);
             }
        }
        Response response = new Response();
        response.setMessage(message);
        response.setStatus(b);
        return response;
    }
}
