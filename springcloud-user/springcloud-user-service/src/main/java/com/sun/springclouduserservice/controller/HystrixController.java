package com.sun.springclouduserservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName HystrixController
 * @Description TODO
 * Author sunhong
 * Date 2020-08-01 18:27
 **/

@RestController
public class HystrixController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hystrix/order/{num}")
    public String queryOrder(@PathVariable("num") int num){

        //restTemplate默认有一个请求超时时间

        return restTemplate.getForObject("http://localhost:8081/orders",String.class);
    }

}
