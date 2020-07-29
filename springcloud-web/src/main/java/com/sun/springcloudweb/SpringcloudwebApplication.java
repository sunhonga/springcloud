package com.sun.springcloudweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.sun.*.feignclients")
@SpringBootApplication
public class SpringcloudwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudwebApplication.class, args);
    }

}
