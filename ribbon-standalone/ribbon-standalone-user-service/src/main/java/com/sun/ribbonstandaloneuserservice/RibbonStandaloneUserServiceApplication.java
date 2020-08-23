package com.sun.ribbonstandaloneuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {"com.sun.*.feignclient", "com.sun.api"})
@SpringBootApplication
public class RibbonStandaloneUserServiceApplication {

    public static void main (String[] args) {
        SpringApplication.run(RibbonStandaloneUserServiceApplication.class, args);
    }

}
