package com.poc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.poc.app.model.Booking;
import com.poc.app.model.Flight;
import com.poc.app.model.User;
import com.poc.app.repository.*;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	BookingRepo BookingRepository;
	
	@Autowired
	UserRepo UserRepo;
	
	@Autowired
	FlightRepo FlightRepo;
	
	@Autowired
	AgentRepo AgentRepo;
	
	@Autowired
	HotelRepo HotelRepo;
	
	@GetMapping(path="/listbooking")
	public List<Booking> list(){
		List<Booking> list = BookingRepository.findAll();
		return list;
	}
	
	
	
	@PostMapping(path="/save/{uid}/{flightid}/{hotelid}", consumes = {"application/json"})
	public void save(@RequestBody Booking booking,@PathVariable("uid") int uid,@PathVariable("flightid") int flightid,@PathVariable("hotelid") int hotelid)
	{
		User user = UserRepo.findById(uid).orElse(null);
		if(user == null)
		{
			System.out.println("User not found so no booking");
			return;
		}
		Booking newBooking = BookingRepository.save(booking);
		newBooking.setFlight(FlightRepo.findById(flightid).orElse(null));
		newBooking.setHotel(HotelRepo.findById(hotelid).orElse(null));
		newBooking.setUser(user);
		BookingRepository.save(newBooking);
//		Flight f1 = FlightRepo.findById(flightid).orElse(null);
//		List<Booking> fbooking = f1.getBooking();
//		fbooking.add(newBooking);
		
	}
	
//	@PutMapping(path = "/update")
//	public Booking update(@RequestBody Booking Booking)
//	{
//		Booking updatedBooking = BookingRepository.save(Booking);
//	    return updatedBooking;
//	}
//	
//	@DeleteMapping(path = "/delete/{id}")
//	public void delete(@PathVariable("id") int id)
//	{
//		BookingRepository.deleteById(id);
//	}
//	
//	@GetMapping(path="/find/{id}")
//	public Booking findById(@PathVariable int id)
//	{
//		 Booking s = BookingRepository.findById(id).get();
//		 return s;
//	}
//	
}
