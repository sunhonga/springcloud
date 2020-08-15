package com.sun.ribbonstandaloneuserservice;

import com.sun.ribbonstandaloneuserservice.feignclient.GuPiaoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName UserServiceController
 * @Description TODO
 * Author sunhong
 * Date 2020-08-06 15:25
 **/
@RestController
public class UserServiceController {


    @Autowired
    RestTemplate restTemplate;

    @Autowired
    GuPiaoClient guPiaoClient;



    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }



    @GetMapping("/user/{id}")
    public String findById(@PathVariable ("id") int id ){
        return restTemplate.getForObject("http://ribbon-standalone-order-service/orders",String.class);
    }


    @GetMapping("/getgupiao")
    public String getGuPiao(){
        return guPiaoClient.getGuPiao();
    }

}
