package com.sun.springcloudorder;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Order {

    @Value("${server.port}")
    private int port;

    @GetMapping("orders")
    public String getOrder(){
        System.out.println(port);
        return "GET ALL ORDERS";
    }
}
