package com.sun.ribbonstandaloneaddrserviceprovider.controller;

import com.sun.api.IAddrCity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddrCityController implements IAddrCity {

    @Value("${server.port}")
    private int port;

    @Override
    public String getAddrByCity() {
        return port+"getAddrByCity";
    }
}
