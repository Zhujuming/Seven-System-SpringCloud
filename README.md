# Seven-System-SpringCloud
###  SpringCloud+SpringBoot+Maven 搭建多模块项目 

***
### 项目简介
-   该项目为自己搭建的的SpringBoot+SpringCloud+Maven框架的多模块项目,数据库使用了MySQL。
-   为了方便自己加深对SpringCloud的项目的理解和实际开发中项目的搭建做参考。
-   项目代码和配置文件中有详细的注释,加深了代码的可读性。
    
---

### 项目模块
-   seven-system-parent 父项目
-   seven-system-common 存放公共包
-   seven-system-consumer 消费者
-   seven-system-report 报表模块
-   seven-system-activity 活动模块
-   seven-system-service 主模块
-   seven-system-eureka-7001 eureka集群1
-   seven-system-eureka-7001 eureka集群2
-   seven-system-eureka-7001 eureka集群3
-   seven-system-generator 自动生成mapper,entity,XXX.xml等文件

![Eclipse Marketplace](https://img.shields.io/eclipse-marketplace/dt/6.svg)
---
### 项目环境
-   Win10+MySQL+JDK8+Redis

---

### 相关技术
- JDK8 代码采用了链式调用 
- 日志框架采用 logback
- Eureka 搭建了集群,
- Fegin 做了负载均衡,默认采用轮询 (Fegin通过接口的方式调用Rest服务，Fegin融合了Ribbon)
- 整合了 Hytrix 作为熔断器

