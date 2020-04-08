package com.liuyang.signin.controller;

import com.liuyang.signin.enity.Response;
import com.liuyang.signin.enity.SignIn;
import com.liuyang.signin.server.SignServer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@CrossOrigin
public class SignInController {

    @Resource
    private SignServer signServer;

    @RequestMapping(value = "/sign")
    public String sign(Model model,@Param("team") int team){
        model.addAttribute("team",team);
        return "index";
    }

    @ResponseBody
    @CrossOrigin
    @PostMapping(value = "/signIn")
    public Response sign(@RequestBody SignIn signIn){
        return signServer.sign(signIn);
    }
}
