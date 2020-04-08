package com.liuyang.signin.mapper;

import com.liuyang.signin.enity.SignIn;
import org.apache.ibatis.annotations.Insert;

public interface SignMapper {

    @Insert("insert into sign_in (name, team_id, sign_time) values (#{name}, #{teamId}, sysdate())")
    boolean insertSignUser(SignIn signIn);
}
