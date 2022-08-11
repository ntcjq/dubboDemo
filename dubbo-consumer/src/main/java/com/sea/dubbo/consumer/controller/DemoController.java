package com.sea.dubbo.consumer.controller;

import com.sea.dubbo.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import request.DemoRequest;

import java.util.Date;
import java.util.Random;

@RestController
public class DemoController {

    @DubboReference(version = "${demo.service.version}")
    private DemoService demoService;

    @GetMapping("demo")
    public String demo(String name) {
        DemoRequest request = new DemoRequest();
        request.setName(name);
        request.setDate(new Date());
        request.setNum((new Random()).nextInt(100));
        return demoService.sayHello(request);
    }
}
