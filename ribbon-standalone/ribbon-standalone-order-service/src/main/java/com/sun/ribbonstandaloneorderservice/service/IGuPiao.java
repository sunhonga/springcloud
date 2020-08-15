package com.sun.ribbonstandaloneorderservice.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface IGuPiao {

    @GetMapping("/getgupiao")
    String getGuPiao();

    @PostMapping("/deletegupiao")
    void deleteGuPiao(int id);
}
