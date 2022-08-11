package com.sea.dubbo.provider.service.impl;

import com.alibaba.fastjson.JSON;
import com.sea.dubbo.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import request.DemoRequest;

@DubboService(version = "${demo.service.version}")
public class DemoserviceImpl implements DemoService {
    public String sayHello(DemoRequest request) {
        return "hello " + JSON.toJSONString(request);
    }
}
