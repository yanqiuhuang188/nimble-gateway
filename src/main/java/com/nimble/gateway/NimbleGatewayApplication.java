package com.nimble.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 使用@EnableZuulProxy注解激活zuul。
 * 该组合注解整合了@EnableCircuitBreaker、@EnableDiscoveryClient，目的是简化配置。
 */
@SpringBootApplication
@EnableZuulProxy
public class NimbleGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NimbleGatewayApplication.class, args);
    }
}
