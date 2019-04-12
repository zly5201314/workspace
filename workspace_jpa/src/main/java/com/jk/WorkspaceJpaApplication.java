package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.jk.mapper")
public class WorkspaceJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkspaceJpaApplication.class, args);
    }

}
