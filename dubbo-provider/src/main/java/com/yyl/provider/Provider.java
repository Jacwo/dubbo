package com.yyl.provider;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
public class Provider {
    public static void main(String[] args) throws IOException {
        System.setProperty("java.net.preferIPv4Stack", "true");
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (int i = 0; i <beanDefinitionNames.length ; i++) {
            System.out.println(            beanDefinitionNames[i]);
        }
        System.out.println("Provider started.");
        System.in.read(); // press any key to exit

    }
}
