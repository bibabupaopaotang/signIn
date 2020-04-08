package com.liuyang.signin.mapper;

import com.liuyang.signin.enity.SignIn;
import com.liuyang.signin.enity.Team;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


public interface TeamMapper {

    @Insert("insert into team (check_num,input_time) values(#{teamId},#{num},sysdate())")
    void insertCheckNum(String num);

    @Select("Select*from team where id = #{teamId} and check_num = #{checkNum}")
    Team getStatus(SignIn signIn);

    @Update("update team set status = 1 where id = #{id}")
    int updateStatusStr(int id);

    @Update("update team set status = 0 where id = #{id}")
    int updateStatusEnd(int id);

    @Insert("insert into team (check_num, title, status, check_id, input_time) values (#{checkNum}, #{title}, 0, #{checkId}, #{inputTime})")
    int createTeam(Team team);

    @Select("select * from team where check_id = #{checkId}")
    Team findTeam(String checkId);
}
