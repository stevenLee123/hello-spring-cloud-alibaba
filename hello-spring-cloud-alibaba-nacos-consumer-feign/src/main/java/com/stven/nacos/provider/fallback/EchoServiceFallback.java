/**
 * @program: hello-spring-cloud-alibaba
 * @description:
 * @author: steven
 * @create: 2019-09-16 22:14
 **/
package com.stven.nacos.provider.fallback;

import com.stven.nacos.provider.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class EchoServiceFallback implements HelloService {
    @Override
    public String hello(String message) {
        return "request fail";
    }
}
