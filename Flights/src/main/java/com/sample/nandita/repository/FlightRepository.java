package com.sample.nandita.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sample.nandita.model.Flight;


@RepositoryRestResource(path="/datarest")
public interface FlightRepository extends MongoRepository<Flight, Integer>{
	
	public List<Flight> findByDestinationName(@Param("name") String name);

}
