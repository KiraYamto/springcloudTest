package org.bobo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author tian.xubo
 * @created 2018 - 04 - 11 9:45
 */
@EnableCircuitBreaker
@EnableHystrix
@EnableHystrixDashboard
@EnableDiscoveryClient
@SpringBootApplication

public class ClientRibbonStart {

    public static void main(String[] args) {
        SpringApplication.run(ClientRibbonStart.class);
    }
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}




