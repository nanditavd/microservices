package com.sample.nandita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.nandita.model.Flight;

@RestController
public class FlightsConsumerService {
	
	@Autowired
	FlightConsumerServiceWithFeign  flightConsumerServiceWithFeign;
	
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public Iterable<Flight> listOfFlights(){
		return flightConsumerServiceWithFeign.listOfFlights();
	}

}
