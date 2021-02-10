package com.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Created by Fangzj
 * @data 2021/2/4 21:14
 **/
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguration {
    @Autowired
    private HelloProperties helloProperties;

    @Bean
    public HelloService helloService() {
        return new HelloService(helloProperties.getName(), helloProperties.getAge());
    }
}

