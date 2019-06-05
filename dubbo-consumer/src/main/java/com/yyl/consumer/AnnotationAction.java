package com.yyl.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yyl.api.DemoService;
import org.springframework.stereotype.Component;

@Component("annotationAction")
public class AnnotationAction {
    @Reference
    private DemoService demoService;

    public String doSayHello(String name) {
        return demoService.sayHello(name);
    }
}
