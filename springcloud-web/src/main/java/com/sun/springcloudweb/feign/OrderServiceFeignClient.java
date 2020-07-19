package com.sun.springcloudweb.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("spring-cloud-order-service")
public interface OrderServiceFeignClient {

    @GetMapping("/orders")
    String getAllOrder();

}
