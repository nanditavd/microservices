package com.sample.nandita.component;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.security.access.prepost.PreAuthorize;

import com.sample.nandita.model.Flight;

public interface FlightRepository extends MongoRepository<Flight, Long> {
	Flight findByFlightNumberAndFlightDate(String flightNumber, String flightDate);

	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	List<Flight> findByOriginAndDestinationAndFlightDate(String origin, String destination, String flightData);
}
