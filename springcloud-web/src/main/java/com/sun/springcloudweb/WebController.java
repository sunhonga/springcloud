package com.sun.springcloudweb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    @GetMapping("/order/{id}")
    public String findById(@PathVariable("id") int id){
        ServiceInstance choose = loadBalancerClient.choose("spring-cloud-order-service");
        String url = String.format("http://%s:%s",choose.getHost(),choose.getPort()+"/orders");
        //return restTemplate.getForObject("http://localhost:8080/orders",String.class);
        return restTemplate.getForObject(url,String.class);
    }
}
