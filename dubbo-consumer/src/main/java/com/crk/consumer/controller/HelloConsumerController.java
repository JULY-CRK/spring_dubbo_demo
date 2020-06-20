package com.crk.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.crk.api.service.HelloService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConsumerController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name){
        int i = 0;
        for(int j = 0;j < 10;j++){
            i++;
        }

        System.out.println("参数=" + name + i);
        return helloService.sayHello(name);
    }
}
