package com.example.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@MapperScan({"com.example.project.*"})

public class ProjectRunApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectRunApplication.class, args);
    }

}
