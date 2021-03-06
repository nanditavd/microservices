package com.sample.nandita;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.sample.nandita.model.Flight;

@RestController
public class FlightsConsumerService {
	
	@Autowired
	DiscoveryClient discoveryClient;
	
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public Iterable<Flight> listOfFlights(){
		List<ServiceInstance> serviceInstances = discoveryClient.getInstances("flight-microservice");
		ServiceInstance serviceInstance = serviceInstances.get(0);
		if(null!=serviceInstance && null!= serviceInstance.getUri()){
			URI uri = serviceInstance.getUri();
		try{
		return (Iterable<Flight>)( new RestTemplate()).getForEntity(new URI(uri.toString().concat("/flights")) , Iterable.class).getBody();
		}
		catch(RestClientException | URISyntaxException e){
			e.printStackTrace();
		}
		
	}
		return null;
	}

}
