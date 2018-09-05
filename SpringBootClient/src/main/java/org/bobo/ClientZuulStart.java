package org.bobo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author tian.xubo
 * @created 2018 - 04 - 12 10:37
 */

@EnableZuulProxy
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
public class ClientZuulStart {
    public static void main(String[] args) {
        SpringApplication.run(ClientZuulStart.class);
    }
}
