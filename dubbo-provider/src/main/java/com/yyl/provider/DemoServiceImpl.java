package com.yyl.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.yyl.api.DemoService;
import jdk.nashorn.internal.ir.annotations.Reference;

@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String s) {
        System.out.println(s);
        return "hello"+s;
    }
}
