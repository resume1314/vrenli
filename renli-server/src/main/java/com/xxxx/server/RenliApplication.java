package com.xxxx.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xxxx.server.mapper")
public class RenliApplication {

    public static void main(String[] args) {
        SpringApplication.run(RenliApplication.class,args);
    }
}
