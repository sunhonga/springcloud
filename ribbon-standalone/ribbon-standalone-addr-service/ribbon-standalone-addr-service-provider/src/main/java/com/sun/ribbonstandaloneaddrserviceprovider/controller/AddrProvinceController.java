package com.sun.ribbonstandaloneaddrserviceprovider.controller;

import com.sun.api.IAddrProvince;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddrProvinceController implements IAddrProvince {

    @Value("${server.port}")
    private int port;

    @Override
    public String getAddrByProvince() {
        return port+"getAddrByProvince";
    }
}
