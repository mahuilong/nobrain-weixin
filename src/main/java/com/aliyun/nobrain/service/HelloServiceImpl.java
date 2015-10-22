package com.aliyun.nobrain.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {

    public String say(String name) {
        return "hello " + name;
    }
}
