package com.start;

/**
 * @author Created by Fangzj
 * @data 2021/2/4 21:14
 **/
public class HelloService {
    private String name;
    private int age;

    public HelloService(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void hello() {
        System.out.println(name + "  age:" + age);
    }
}

