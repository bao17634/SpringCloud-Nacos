package com.saas.cloud.nacos.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * @ClassName: ServiceTransferApi
 * @Description: 服务调用API
 * @Author: yanrong
 * @Date: 2020/1/8 10:45
 */
@FeignClient(value= "provider")
@Component
public interface ServiceTransferApi {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/add")
    String add1(@RequestParam(value = "a") Integer a,@RequestParam(value = "b") Integer b);
}
