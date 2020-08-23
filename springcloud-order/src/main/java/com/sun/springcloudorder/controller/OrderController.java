package com.sun.springcloudorder.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {


    @Value("${server.port}")
    private int port;

    @GetMapping("/getorder")
    String getOrder(){
        return port+"get add orders";
    }


    @PostMapping("/addorder")
    String addOrder(){
        return port+"add orderSUCCESS";
    }

}
