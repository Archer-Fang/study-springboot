package com.test;

import com.start.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Created by Fangzj
 * @data 2021/2/4 21:28
 **/
@RestController
@RequestMapping("/api")
public class TestController {
    @Resource(name = "helloService")
    private HelloService helloService;

    @GetMapping("test")
    public String get() {
        helloService.hello();
        return "success";
    }
}
