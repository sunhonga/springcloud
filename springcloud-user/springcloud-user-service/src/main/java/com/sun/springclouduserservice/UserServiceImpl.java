package com.sun.springclouduserservice;

import com.sun.springclouduserapi.User;
import com.sun.springclouduserapi.UserSerivce;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * Author sunhong
 * Date 2020-7-21 15:00
 **/
@RestController
public class UserServiceImpl implements UserSerivce {
    @Override
    public String users() {
        return "Return all Orders";
    }


    @Override
    public int insert(User user) {
        return 0;
    }
}
