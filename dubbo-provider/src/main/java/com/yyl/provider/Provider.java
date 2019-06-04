package com.yyl.provider;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * leapstack author:yangyuanliang Date:2019-06-03 Time:16:21
 **/
@ComponentScan("com.yyl")
public class Provider {
    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        context.start();
        System.out.println("Provider started.");
        try {
            System.in.read(); // press any key to exit
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
