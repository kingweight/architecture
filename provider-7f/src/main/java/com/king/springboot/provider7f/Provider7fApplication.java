package com.king.springboot.provider7f;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Provider7fApplication {

	public static void main(String[] args) {
		SpringApplication.run(Provider7fApplication.class, args);
	}

}

