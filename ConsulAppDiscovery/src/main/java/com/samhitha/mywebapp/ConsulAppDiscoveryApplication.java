package com.samhitha.mywebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulAppDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulAppDiscoveryApplication.class, args);
	}

}
