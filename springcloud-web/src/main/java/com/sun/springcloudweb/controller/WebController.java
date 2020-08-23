package com.sun.springcloudweb.controller;


import com.sun.springcloudweb.feignclients.OrderServiceClient;
import com.sun.springcloudweb.feignclients.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebController {

    @Autowired
    RestTemplate restTemplate;

    /*@Autowired
    LoadBalancerClient loadBalancerClient;*/

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    @Autowired
    private OrderServiceClient orderService;

    @Autowired
    private UserServiceClient userService;

    @GetMapping("/order/{id}")
    public String findById(@PathVariable("id") int id){
        //method1:
        //return restTemplate.getForObject("http://localhost:8080/orders",String.class);
        //method2:
        /* ServiceInstance choose = loadBalancerClient.choose("order-service");
        String url = String.format("http://%s:%s",choose.getHost(),choose.getPort()+"/orders");*/
        //return restTemplate.getForObject(url,String.class);
        //method3:
        return restTemplate.getForObject("http://order-service/orders",String.class);
    }



    @GetMapping("/getuserorder")
    String getUserOrder(){

        return userService.users()+orderService.getAllOrder();
    }

}
