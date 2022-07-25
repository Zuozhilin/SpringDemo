package com.example.demo220725;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo220725")
public class Demo220725Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo220725Application.class, args);
    }

}
