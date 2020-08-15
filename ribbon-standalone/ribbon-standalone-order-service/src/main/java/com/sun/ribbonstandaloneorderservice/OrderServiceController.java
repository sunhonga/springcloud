package com.sun.ribbonstandaloneorderservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderServiceController
 * @Description TODO
 * Author sunhong
 * Date 2020-08-06 15:36
 **/
@RestController
public class OrderServiceController {


    @Value("${server.port}")
    private int port;


    @GetMapping("/orders")
    public String getAllOrder(){
        System.out.println("port:"+port);
        return port+"get All Orders";
    }


}
