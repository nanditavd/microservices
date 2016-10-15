package com.sample.nandita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FlightsConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightsConsumerApplication.class, args);
	}
}
