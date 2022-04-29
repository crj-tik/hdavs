package com.parent.hdavs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@MapperScan("com.parent.hdavs.bean")
public class HdavsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HdavsApplication.class, args);
    }

}
