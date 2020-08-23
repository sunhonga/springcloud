package com.sun.ribbonstandaloneuserservice.feignclient;

import com.sun.api.IAddrProvince;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("ribbon-standalone-addrprovince-service")
public interface AddrProvinceClient extends IAddrProvince {
}
