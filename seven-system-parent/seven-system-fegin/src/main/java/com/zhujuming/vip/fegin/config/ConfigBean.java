package com.zhujuming.vip.fegin.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Boot --> spring applicationContext.xml
 * -->@Configuration配置 =  applicationContext.xml
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    
    /**
     * 先按照 RoundRobinRule的策略获取服务，
     * 如果获取服务失败在指定的时间内会进行重试，获取可用服务
     */
    @Bean
    public IRule myRule() {
        return new RetryRule();
    }
}
