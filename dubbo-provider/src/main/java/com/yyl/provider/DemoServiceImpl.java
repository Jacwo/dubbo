package com.yyl.provider;

import com.yyl.api.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String s) {
        System.out.println(s);
        return "hello"+s;
    }
}
