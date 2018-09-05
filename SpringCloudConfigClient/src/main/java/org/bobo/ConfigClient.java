package org.bobo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tian.xubo
 * @created 2018 - 04 - 12 16:33
 */
@EnableAutoConfiguration
@SpringBootApplication
public class ConfigClient {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class);
    }
}
