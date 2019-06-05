package com.yyl.consumer;

import com.yyl.api.DemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main( String[] args ) {
      //  ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                =new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        AnnotationAction demoService = (AnnotationAction) annotationConfigApplicationContext.getBean("annotationAction");

        //DemoService demoService= (DemoService) applicationContext.getBean("demoService");
        while (true){
            demoService.doSayHello("test");

        }

    }
}
