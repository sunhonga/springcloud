package com.sun.springclouduserservice;

import com.sun.springclouduserapi.User;
import com.sun.springclouduserapi.feignclients.UserServiceFeignClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * Author sunhong
 * Date 2020-7-21 15:00
 **/
@RestController
public class UserServiceImpl implements UserServiceFeignClient {

    @Value("${server.port}")
    private int port;


    @Override
    public String users() {
        return "Return all Orders"+this.port;
    }


    @Override
    public int insert(User user) {
        return 0;
    }
}
