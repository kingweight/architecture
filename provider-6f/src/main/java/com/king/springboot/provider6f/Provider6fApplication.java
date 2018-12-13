package com.king.springboot.provider6f;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Provider6fApplication {

	public static void main(String[] args) {
		SpringApplication.run(Provider6fApplication.class, args);
	}

}

