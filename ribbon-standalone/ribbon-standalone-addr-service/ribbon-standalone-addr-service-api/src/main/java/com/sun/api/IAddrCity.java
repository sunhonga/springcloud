package com.sun.api;

import org.springframework.web.bind.annotation.GetMapping;

public interface IAddrCity {

    @GetMapping("/getAddrByCity")
    String getAddrByCity();
}
