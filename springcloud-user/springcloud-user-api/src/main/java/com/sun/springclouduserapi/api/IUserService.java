package com.sun.springclouduserapi.api;


import com.sun.springclouduserapi.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface IUserService {


    @GetMapping("/users")
    String users();


    @PostMapping("/user")
    int insert(User user);


}
