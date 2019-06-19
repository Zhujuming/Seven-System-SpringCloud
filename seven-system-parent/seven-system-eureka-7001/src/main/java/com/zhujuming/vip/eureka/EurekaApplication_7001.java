package com.zhujuming.vip.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //EurekaServer 服务器启动类，接受其他为服务注册进来
public class EurekaApplication_7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication_7001.class,args);
    }
}

