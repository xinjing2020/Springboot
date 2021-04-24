package com.xsh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.xsh.mapper")
public class MyblogApplication {

    public static void main(String[] args) {
        SpringApplication.run (MyblogApplication.class, args);
    }

}
