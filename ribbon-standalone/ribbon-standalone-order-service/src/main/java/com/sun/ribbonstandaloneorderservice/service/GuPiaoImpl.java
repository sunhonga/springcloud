package com.sun.ribbonstandaloneorderservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName GuPiaoImpl
 * @Description TODO
 * Author sunhong
 * Date 2020-08-12 19:31
 **/
@RestController
public class GuPiaoImpl implements IGuPiao {

    @Value("${server.port}")
    private  int port;



    @Override
    public String getGuPiao() {
        System.out.println(port);
        return "get all gupiao";
    }

    @Override
    public void deleteGuPiao(int id) {

    }
}
