package com.sample.nandita.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sample.nandita.dao.FlightConsumerServiceDAO;
import com.sample.nandita.model.Flight;


@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightConsumerServiceDAO flightConsumerServiceDAO;
	
	@Override
	@HystrixCommand(fallbackMethod="listOfFlightsFallBackMethod")
	public Iterable<Flight> listOfFlights() {
		return flightConsumerServiceDAO.listOfFlights();
	}
	public Iterable<Flight> listOfFlightsFallBackMethod() {
		List<Flight> list =new ArrayList<>();
		list.add(new Flight(3,new Date(),"Bangalore"));
		return list;
	}

}
