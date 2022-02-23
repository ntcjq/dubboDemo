package com.sea.dubbo.provider.service.impl;

import com.sea.dubbo.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "${demo.service.version}")
public class DemoserviceImpl implements DemoService {
    public String sayHello(String name) {
        return "hello " + name;
    }
}
