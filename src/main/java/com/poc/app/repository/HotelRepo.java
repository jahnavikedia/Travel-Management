package com.poc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.app.model.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, Integer>{

}
