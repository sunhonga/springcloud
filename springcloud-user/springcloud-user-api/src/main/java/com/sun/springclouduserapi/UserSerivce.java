package com.sun.springclouduserapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface UserSerivce {


    @GetMapping("/users")
    String users();


    @PostMapping("/user")
    int insert(User user);


}
