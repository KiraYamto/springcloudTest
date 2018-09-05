package org.bobo;

import org.bobo.util.HttpClientUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tian.xubo
 * @created 2018 - 04 - 10 17:32
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
public class ClientStart {
    public static void main(String[] args) throws Exception{

        SpringApplication.run(ClientStart.class);

    }
}
