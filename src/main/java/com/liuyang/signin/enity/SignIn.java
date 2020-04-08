package com.liuyang.signin.enity;

import lombok.Data;

import java.io.Serializable;

@Data
public class SignIn implements Serializable {

    private int id;

    private String name;

    private String checkNum;

    private int teamId;
}
