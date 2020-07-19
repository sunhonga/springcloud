package com.sun.userservice;

import com.sun.UserDto;
import com.sun.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceImpl implements UserService {


    @Override
    public String users() {
        return "all user";
    }

    @Override
    public String insert(UserDto dto) {
        return "插入成功";
    }
}