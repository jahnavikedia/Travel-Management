package com.poc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.poc.app.model.Booking;

public interface BookingRepo extends JpaRepository<Booking,Integer>{


}
