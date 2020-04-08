package com.liuyang.signin.controller;

import com.liuyang.signin.enity.Response;
import com.liuyang.signin.enity.Team;
import com.liuyang.signin.enity.User;
import com.liuyang.signin.server.AdminServer;
import com.liuyang.signin.server.TeamServer;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
public class AdminController {

    @Resource
    private AdminServer adminServer;

    @Resource
    private TeamServer teamServer;

    @PostMapping(value = "/login")
    public Boolean Login(@RequestBody User data){
        return adminServer.Login(data);
    }

    @CrossOrigin
    @PostMapping(value = "/team")
    public Response createTeam(@RequestBody Team team){
        return teamServer.createTeam(team);
    }

    @CrossOrigin
    @PostMapping(value = "/start")
    public Boolean startTeam(@RequestBody Team team){
        return teamServer.startTeam(team);
    }

    @CrossOrigin
    @PostMapping(value = "/end")
    public Boolean endTeam(@RequestBody Team team){
        return teamServer.endTeam(team);
    }
}
