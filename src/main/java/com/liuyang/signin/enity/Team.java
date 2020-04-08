package com.liuyang.signin.enity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Team implements Serializable {

    private int id;

    private String checkNum;

    private Date inputTime;

    private int status;

    private String title;

    private String checkId;
}
