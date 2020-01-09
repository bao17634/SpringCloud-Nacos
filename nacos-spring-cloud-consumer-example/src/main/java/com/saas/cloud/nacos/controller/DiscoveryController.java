package com.saas.cloud.nacos.controller;
import com.saas.cloud.nacos.api.ServiceTransferApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DiscoveryController
 * @Description: 服务调用Controller
 * @Author: yanrong
 * @Date: 2020/1/8 10:45
 */
@RestController
public class DiscoveryController {
    @Autowired
    private ServiceTransferApi serviceTransferApi;
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return serviceTransferApi.hello(name);
    }
    @RequestMapping("/add/{a}/{b}")
    public String add(@PathVariable("a") Integer a,@PathVariable("b") Integer b) {
        return serviceTransferApi.add1(a,b);
    }
}
