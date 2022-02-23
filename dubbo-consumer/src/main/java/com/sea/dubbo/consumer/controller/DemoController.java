package com.sea.dubbo.consumer.controller;

import com.sea.dubbo.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @DubboReference(version = "${demo.service.version}")
    private DemoService demoService;

    @GetMapping("demo")
    public String demo(String name) {
        return demoService.sayHello(name);
    }
}
