package com.saas.cloud.nacos.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ProviderController
 * @Description: 服务提供者Controller
 * @Author: yanrong
 * @Date: 2020/1/8 11:03
 */
@RestController
public class ProviderController {
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello1 " + name + "，this is first messge";
    }
    @RequestMapping("/add")
    public String add(@RequestParam(value = "a") Integer a,@RequestParam(value = "b") Integer b) {
        return "the sum of a、b is "+String.valueOf(a+b);
    }
}
