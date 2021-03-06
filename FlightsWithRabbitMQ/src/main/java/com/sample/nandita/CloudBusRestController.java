package com.sample.nandita;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@ConfigurationProperties(prefix="newConfig")
@RefreshScope
public class CloudBusRestController {
	
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@RequestMapping("/")
	public ResponseEntity<String> getConfigInfo(){
		System.out.println("getData()----"+getData());
		return new ResponseEntity<String>(getData(),HttpStatus.OK);
	}
	
	
	

}
