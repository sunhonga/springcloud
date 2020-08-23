package com.sun.springcloudweb.feignclients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("order-service")
public interface OrderServiceClient {

    @GetMapping("/getorder")
    String getAllOrder();

    @PostMapping("/addorder")
    String addOrder();

}
