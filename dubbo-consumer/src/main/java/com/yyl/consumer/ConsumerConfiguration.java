package com.yyl.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "com.yyl.consumer")
@PropertySource("classpath:/consumer.properties")
@ComponentScan(value = {"com.yyl.consumer"})
public class ConsumerConfiguration {

}
