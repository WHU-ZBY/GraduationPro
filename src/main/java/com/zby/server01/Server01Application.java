package com.zby.server01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.zby.server01.dao")
public class Server01Application {

    public static void main(String[] args) {
        SpringApplication.run(Server01Application.class, args);
    }

}
