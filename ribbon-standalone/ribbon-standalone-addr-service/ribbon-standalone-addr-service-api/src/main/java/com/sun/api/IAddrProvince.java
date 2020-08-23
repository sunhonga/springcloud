package com.sun.api;

import org.springframework.web.bind.annotation.GetMapping;

public interface IAddrProvince {

    @GetMapping("/getAddrByProvince")
    String getAddrByProvince();
}
