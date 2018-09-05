package org.bobo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import zipkin.server.EnableZipkinServer;

/**
 * @author tian.xubo
 * @created 2018 - 04 - 19 9:42
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableZipkinServer
public class SleuthStart {
    public static void main(String[] args) {
        SpringApplication.run(SleuthStart.class);
    }
}
