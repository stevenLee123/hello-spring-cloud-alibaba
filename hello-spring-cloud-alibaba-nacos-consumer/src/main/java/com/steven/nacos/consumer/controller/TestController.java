/**
 * User: Administrator
 * Email:1144873128@qq.com
 * Date: 2019/9/9
 * Time: 22:27
 * Description:
 */
package com.steven.nacos.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    private final RestTemplate restTemplate;

    @Autowired
    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/hello/{message}")
    public String hello(@PathVariable("message") String message) {
        return restTemplate.getForObject("http://service-provider/hello/" + message , String.class);
    }
}
