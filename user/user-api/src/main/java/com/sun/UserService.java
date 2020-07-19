package com.sun;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface UserService {

    @GetMapping("/users")
    String users();

    @PostMapping("/user")
    String insert(UserDto dto);
}
