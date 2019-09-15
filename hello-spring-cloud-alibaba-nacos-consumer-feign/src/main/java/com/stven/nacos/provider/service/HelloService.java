package com.stven.nacos.provider.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * User: Administrator
 * Email:1144873128@qq.com
 * Date: 2019/9/9
 * Time: 23:07
 * Description:
 */
@FeignClient(name = "service-provider")
public interface HelloService {
    @GetMapping(value = "/hello/{message}")
    public String hello(@PathVariable("message") String message);
}
