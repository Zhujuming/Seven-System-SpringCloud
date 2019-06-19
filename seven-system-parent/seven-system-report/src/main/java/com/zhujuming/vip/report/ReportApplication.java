package com.zhujuming.vip.report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient // 服务发现
@EnableEurekaClient    // 本服务启动后会自动注册进Erueka服务中
public class ReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReportApplication.class,args);
    }
}
