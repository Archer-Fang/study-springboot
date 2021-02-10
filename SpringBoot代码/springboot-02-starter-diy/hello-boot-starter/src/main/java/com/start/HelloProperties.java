package com.start;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Created by Fangzj
 * @data 2021/2/4 21:14
 **/
@ConfigurationProperties("hello")
public class HelloProperties {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
