package com.sample.nandita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudBusFlightsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudBusFlightsApplication.class, args);
	}
}
