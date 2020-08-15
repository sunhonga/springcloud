package com.sun.ribbonstandaloneuserservice.feignclient;

import com.sun.ribbonstandaloneorderservice.service.IGuPiao;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(name="ribbon-standalone-order-service",configuration ={} )
public interface GuPiaoClient extends IGuPiao {
}
