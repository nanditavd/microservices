package com.sample.nandita.component;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sample.nandita.model.Flight;

public interface FlightRepository extends MongoRepository<Flight, Long> {
	Flight findByFlightNumberAndFlightDate(String flightNumber, String flightDate);

	
	List<Flight> findByOriginAndDestinationAndFlightDate(String origin, String destination, String flightData);
}
