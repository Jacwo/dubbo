package com.yyl.consumer;

import com.yyl.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Consumer {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        DemoService demoService = (DemoService) applicationContext.getBean("demoService");
        demoService.sayHello("test");

    }
}
