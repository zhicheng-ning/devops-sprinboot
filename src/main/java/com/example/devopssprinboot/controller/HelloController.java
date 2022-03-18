package com.example.devopssprinboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: devops-sprinboot
 * @ClassName: HelloController
 * @author: nzcer
 * @creat: 2022/3/12 19:41
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/hi")
    public String sayHello() {
        return "hello, github action in springboot";
    }

    @GetMapping("/github")
    public String hi() {
        return "项目地址：https://github.com/zhicheng-ning/devops-sprinboot";
    }
}
