package com.sample.nandita;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sample.nandita.model.Flight;
import com.sample.nandita.repository.FlightRepository;



@RestController
@RequestMapping("/flights")
public class FlightRestController {
	
	@Autowired 
	private FlightRepository flightRepository;
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public Iterable<Flight> listOfFlights(){
		List<Flight> list =new ArrayList<>();
		list.add(new Flight(1,new Date(),"Goa"));
		list.add(new Flight(2,new Date(),"Sirsi"));
		list.add(new Flight(3,new Date(),"Hubli"));
		return list;
		//return flightRepository.findAll();
		//throw new RuntimeException("Unable to serve");
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Flight getFlight(@PathVariable("id")Integer id){
		return flightRepository.findOne(id);
	}
	@RequestMapping(value="",method=RequestMethod.POST)
	@ResponseStatus(code=HttpStatus.CREATED)
	public void createFlight(@RequestBody Flight flight){
		 flightRepository.save(flight);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	public void updateFlight(@RequestBody Flight flight){
		Flight existingFlight = flightRepository.findOne(flight.getId());
		existingFlight.setDestinationName(flight.getDestinationName());
		existingFlight.setStartTime(flight.getStartTime());
		flightRepository.save(existingFlight);
	}
	

}
