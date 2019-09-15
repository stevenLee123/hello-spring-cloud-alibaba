/**
 * User: Administrator
 * Email:1144873128@qq.com
 * Date: 2019/9/9
 * Time: 22:05
 * Description:
 */
package com.stven.nacos.provider.controller;

import com.stven.nacos.provider.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hello/{message}")
    public String hello(@PathVariable("message") String message) {
        return helloService.hello(message);
    }
}
