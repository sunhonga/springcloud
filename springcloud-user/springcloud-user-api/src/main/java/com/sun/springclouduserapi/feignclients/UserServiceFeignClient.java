package com.sun.springclouduserapi.feignclients;


import com.sun.springclouduserapi.UserSerivce;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("user-service")
public interface UserServiceFeignClient extends UserSerivce {
}
