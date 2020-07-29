package com.sun.springcloudweb.feignclients;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenFeignController {

    @Autowired
    OrderServiceFeignClient orderServiceFeignClient;

    @GetMapping("/feign")
    public String test(){
        return orderServiceFeignClient.getAllOrder();
    }
}
