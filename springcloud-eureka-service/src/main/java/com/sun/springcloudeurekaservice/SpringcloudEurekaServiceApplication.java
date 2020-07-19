package com.sun.springcloudeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServiceApplication.class, args);
    }

}
