package com.infosys.project1.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductApplication {
	public static void main(String[] args) {
		System.out.println("before controller");
		SpringApplication.run(ProductApplication.class, args);
		System.out.println("after controller");
		
	}
}
