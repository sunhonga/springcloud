package com.sun.springclouduserapi.feignclients;


import com.sun.springclouduserapi.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("user-service")
public interface UserServiceFeignClient  {


    @GetMapping("/users")
    String users();


    @PostMapping("/user")
    int insert(User user);


}
