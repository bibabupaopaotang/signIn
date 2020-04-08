
package com.liuyang.signin.server;

import com.liuyang.signin.enity.Response;
import com.liuyang.signin.enity.Team;
import com.liuyang.signin.mapper.TeamMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

@Service
public class TeamServer {

    @Resource
    private TeamMapper teamMapper;

    public Response createTeam(Team team){
        team.setCheckId(UUID.randomUUID().toString());
        team.setInputTime(new Date());
        Response response = new Response();
        int i = teamMapper.createTeam(team);
        if(i > 0) {
            Team team1 = teamMapper.findTeam(team.getCheckId());
            response.setStatus(true);
            response.setTeam(team1);
            response.setMessage("创建签到成功");
        }else {
            response.setStatus(false);
            response.setMessage("创建签到失败请重试");
        }
        return response;
    }

    public Boolean startTeam(Team team) {
        return (teamMapper.updateStatusStr(team.getId())>0);
    }

    public Boolean endTeam(Team team) {
        return (teamMapper.updateStatusEnd(team.getId())>0);
    }
}