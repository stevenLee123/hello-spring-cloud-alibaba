/**
 * User: Administrator
 * Email:1144873128@qq.com
 * Date: 2019/9/9
 * Time: 22:26
 * Description:
 */
package com.steven.nacos.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConsumerConfiguration {
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
