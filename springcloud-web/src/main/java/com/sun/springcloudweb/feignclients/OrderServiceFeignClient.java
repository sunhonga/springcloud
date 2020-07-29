package com.sun.springcloudweb.feignclients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("order-service")
public interface OrderServiceFeignClient {

    @GetMapping("/orders")
    String getAllOrder();

}
