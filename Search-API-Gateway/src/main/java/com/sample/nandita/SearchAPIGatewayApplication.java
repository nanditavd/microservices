package com.sample.nandita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.CrossOrigin;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2 
@CrossOrigin
@EnableZuulProxy
public class SearchAPIGatewayApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SearchAPIGatewayApplication.class, args);
	}
	
	
}
