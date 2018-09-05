package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JvmTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JvmTestApplication.class, args);
		System.out.println(1);
	}
}
