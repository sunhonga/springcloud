package com.sun.ribbonstandaloneuserservice.feignclient;

import com.sun.api.IAddrCity;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("ribbon-standalone-addrcity-service")
public interface AddrCityClient extends IAddrCity {
}
