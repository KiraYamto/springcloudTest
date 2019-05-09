package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Serializable;
import java.util.Properties;


@SpringBootApplication
public class JvmTestApplication implements Serializable {

	public static void main(String[] args) {
		//SpringApplication.=run(JvmTestApplication.class, args);
		System.out.println(1+"1");


	}
}
