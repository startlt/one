package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableCaching      //redis使用注解必须@EnableCaching 启动
@MapperScan(basePackages = "com.example.dao")
@EnableTransactionManagement
@SpringBootApplication
public class app {
    public static void main(String[] args) {
        SpringApplication.run(app.class,args);
    }
}
