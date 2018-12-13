package com.king.springboot.consumer7f;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Consumer7fApplication {

	public static void main(String[] args) {
		SpringApplication.run(Consumer7fApplication.class, args);
	}

}

