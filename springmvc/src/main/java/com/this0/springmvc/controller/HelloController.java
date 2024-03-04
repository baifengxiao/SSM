package com.this0.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    //handlers

    /**
     * handler就是controller内部的具体方法
     * @RequestMapping("/springmvc/hello") 就是用来向handlerMapping中注册的方法注解!
     * @ResponseBody 代表向浏览器直接返回数据!
     */
    @RequestMapping("/springmvc/hello")
    @ResponseBody
    public String hello(){
        System.out.println("HelloController.hello");
        return "hello springmvc!!";
    }
    @GetMapping("/demo")
    public void handle(@CookieValue("JSESSIONID") String cookie) {
        System.out.println("接收到了cookie数据："+cookie);
    }
}
