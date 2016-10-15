package com.sample.nandita;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.MediaType;

import com.sample.nandita.model.Flight;

@FeignClient("flight-microservice")
public interface FlightConsumerServiceWithFeign {

	@RequestMapping(value="/flights",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Flight> listOfFlights(); 
	
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET , produces=MediaType.APPLICATION_JSON_VALUE)
	public Flight getFlight(@PathVariable("id")Integer id);
	
	
	@RequestMapping(value="",method=RequestMethod.POST)
	@ResponseStatus(code=HttpStatus.CREATED)
	public void createFlight(@RequestBody Flight flight);
	
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	public void updateFlight(@RequestBody Flight flight);
}
