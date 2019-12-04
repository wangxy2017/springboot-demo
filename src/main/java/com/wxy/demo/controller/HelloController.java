package com.wxy.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author sir
 * @Date 2019/12/4 11:10
 * @Description TODO
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
