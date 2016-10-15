package com.sample.nandita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories(basePackages="com.sample.nandita.repository")
public class FlightsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightsApplication.class, args);
	}
}
