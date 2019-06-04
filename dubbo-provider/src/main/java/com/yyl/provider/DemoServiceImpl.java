package com.yyl.provider;

import com.yyl.api.DemoService;
import org.springframework.stereotype.Service;


/**
 * leapstack author:yangyuanliang Date:2019-06-03 Time:16:11
 **/
public class DemoServiceImpl implements DemoService {


    @Override
    public String sayHello(String s) {
        System.out.println(s);
        return "hello"+s;
    }
}
