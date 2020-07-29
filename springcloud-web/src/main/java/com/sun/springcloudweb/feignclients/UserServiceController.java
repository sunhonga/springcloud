package com.sun.springcloudweb.feignclients;



import com.sun.springclouduserapi.User;
import com.sun.springclouduserapi.feignclients.UserServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {


    @Autowired
    UserServiceFeignClient userServiceFeignClient;


    @GetMapping("/users")
    public String test(){
        return userServiceFeignClient.users();
    }

    @PostMapping("/user")
    public String insert(){
        User user = new User();
        return userServiceFeignClient.insert(user)+"";
    }

}
