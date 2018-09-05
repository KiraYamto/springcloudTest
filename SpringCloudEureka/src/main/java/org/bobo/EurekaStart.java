package org.bobo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;





/**
 * @author tian.xubo
 * @created 2018 - 04 - 10 16:25
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class EurekaStart {
    public static void main(String[] args) {
        SpringApplication.run(EurekaStart.class);
    }
}
