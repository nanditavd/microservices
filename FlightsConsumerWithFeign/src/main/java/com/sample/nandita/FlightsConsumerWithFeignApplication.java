package com.sample.nandita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RibbonClient(name="flight-microservice", configuration= LoadBalancerConfig.class)
public class FlightsConsumerWithFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightsConsumerWithFeignApplication.class, args);
	}
}
