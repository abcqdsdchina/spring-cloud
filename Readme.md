SpringCloud工程使用说明
======================================

该工程主要基于SpringCloudNetflix微服务框架搭建，
主要包括Eureka服务注册中心，Ribbon客户端负载均衡器，
Feign声明式接口服务，Hystrix断路器，Zuul服务网关。

#Eureka服务注册中心
###服务注册中心搭建
<p>在pom文件中加入依赖spring-cloud-starter-eureka-server;
<p>在配置文件中加入配置eureka.client.register-with-eureka=false，eureka.client.fetch-registry=false;
<p>在@SpringBootApplication类上加入注解@EnableEurekaServer;

###服务提供者配置
<p>在pom文件中加入依赖spring-cloud-starter-eureka-client;
<p>在配置文件中加入配置eureka.client.service-url=defaultZone: http://admin:admin@eureka-a:8080/eureka, http://admin:admin@eureka-b:8082/eureka;

###服务消费者配置
<p>在pom文件中加入依赖spring-cloud-starter-eureka-client;
<p>在配置文件中加入配置eureka.client.service-url=defaultZone: http://admin:admin@eureka-a:8080/eureka, http://admin:admin@eureka-b:8082/eureka;

#Ribbon客户端负载均衡器
###服务消费者配置
在POM文件中加入依赖spring-cloud-starter-netflix-eureka-client;

#Feign声明式接口
###服务消费者配置
<p>在POM文件中加入依赖spring-cloud-starter-openfeign;
<p>在@SpringBootApplication注解的启动类上加入注解@EnableFeignClients;
<p>创建接口类并加入注解@FeignClient，在方法上加入注解@GetMapping;

#Hystrix断路器
###服务提供者降级配置
<p>在POM文件中加入依赖spring-cloud-starter-netflix-hystrix;
<p>在@SpringBootApplication注解的启动类上加入注解@EnableCircuitBreaker;
<p>在Controller的方法上加入注解@HystrixCommand，指定fallbackMethod;

###服务消费者熔断配置
<p>在@SpringBootApplication的类上加入注解@EnableFeignClients;
<p>定义FallbackFactory，重写Create方法返回提供降级功能的类;
<p>在注解@FeignClient上配置属性fallbackFactory;

###Hystrix Dashboard断路器监控配置
<p>在POM文件中加入依赖spring-cloud-starter-netflix-hystrix-dashboard;
<p>在@SpringBootApplication注解的启动类上加入注解@EnableHystrixDashboard;

###Turbine 断路器聚合监控配置
<p>在POM文件中加入依赖spring-cloud-starter-netflix-turbine;
<p>在application.yml文件中加入配置eureka.client.register-with-eureka=false; 
eureka.client.service-url=defaultZone: http://admin:admin@eureka-a:8080/eureka, http://admin:admin@eureka-b:8082/eureka; 
turbine.app-config=MALL-PRODUCT, MALL-USER; 
turbine.cluster-name-expression=new String("default");
<p>在@SpringBootApplication注解的启动类上加入注解@EnableTurbine;

###Zuul服务网关
<p>在POM文件中加入依赖spring-cloud-starter-netflix-eureka-client，spring-cloud-netflix-zuul;
<p>在application.yml文件中加入配置eureka.client.service-url=defaultZone: http://admin:admin@eureka-a:8080/eureka, http://admin:admin@eureka-b:8082/eureka
<p>在@SpringBootApplication注解的启动类上加入注解@EnableZuulProxy
