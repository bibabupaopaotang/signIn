package com.liuyang.signin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.liuyang.signin.mapper")
@SpringBootApplication
public class SigninApplication {

    public static void main(String[] args) {
        SpringApplication.run(SigninApplication.class, args);
    }

}
