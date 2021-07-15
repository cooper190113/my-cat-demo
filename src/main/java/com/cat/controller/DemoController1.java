package com.cat.controller;

import com.cat.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: DemoController1
 * @Author: wutuo
 * @Date: 2021-07-15
 * @Version:v1.0
 */
@RestController
public class DemoController1 {
    @Autowired
    private CatService catServiceImpl;

    @GetMapping("/hello")
    public String hello() {
        return catServiceImpl.getHello();
    }
}
