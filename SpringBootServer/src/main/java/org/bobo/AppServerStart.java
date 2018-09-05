package org.bobo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author tian.xubo
 * @created 2018 - 04 - 10 13:44
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
public class AppServerStart {
    public static void main(String[] args) {
        SpringApplication.run(AppServerStart.class);
    }

}
