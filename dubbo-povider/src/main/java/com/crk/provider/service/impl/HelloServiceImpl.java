package com.crk.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.crk.api.service.HelloService;
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
