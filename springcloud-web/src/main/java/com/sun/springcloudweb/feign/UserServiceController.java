package com.sun.springcloudweb.feign;


import com.sun.UserDto;
import com.sun.UserServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {


    @Autowired
    UserServiceFeignClient userServiceFeignClient;


    @GetMapping("/user")
    public String test(){
        return userServiceFeignClient.users();
    }

    @PostMapping("/suer")
    public String insert(){
        UserDto userDto = new UserDto();
        return userServiceFeignClient.insert(userDto);
    }

}
