package com.sun.springclouduserservice;

import com.sun.springclouduserapi.User;
import com.sun.springclouduserapi.api.IUserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * Author sunhong
 * Date 2020-7-21 15:00
 **/
@RestController
public class UserServiceImpl implements IUserService {

    @Value("${server.port}")
    private int port;


    @Override
    public String users() {
        return this.port+"Return all Orders";
    }


    @Override
    public int insert(User user) {
        return 0;
    }
}
