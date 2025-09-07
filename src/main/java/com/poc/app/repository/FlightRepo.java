package com.poc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.poc.app.model.Flight;

public interface FlightRepo extends JpaRepository<Flight, Integer>{

}
