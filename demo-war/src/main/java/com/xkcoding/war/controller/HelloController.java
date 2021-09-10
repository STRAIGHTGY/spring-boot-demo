package com.xkcoding.war.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 11865 on 2021/5/24.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("say")
    public String hello(){
        return "Hello World 222";
    }

}

