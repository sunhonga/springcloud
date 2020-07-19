package com.sun;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("user-service")
public interface UserServiceFeignClient extends UserService{

}
