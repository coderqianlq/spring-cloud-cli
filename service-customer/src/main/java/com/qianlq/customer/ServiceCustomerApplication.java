package com.qianlq.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@EnableHystrix
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.qianlq.support"})
@SpringBootApplication(scanBasePackages = {"com.qianlq.support", "com.qianlq.customer"})
public class ServiceCustomerApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 使用外部tomcat启动
        return builder.sources(ServiceCustomerApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceCustomerApplication.class, args);
    }
}
