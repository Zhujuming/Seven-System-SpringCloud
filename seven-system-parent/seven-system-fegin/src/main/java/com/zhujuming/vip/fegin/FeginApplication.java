package com.zhujuming.vip.fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient    // 本服务启动后会自动注册进Erueka服务中
@EnableFeignClients(basePackages = {"com.zhujuming.vip"})
@ComponentScan("com.zhujuming.vip")
public class FeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeginApplication.class,args);
    }
}
