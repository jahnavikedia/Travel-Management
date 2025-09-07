package com.poc.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.poc.app.model.Agent;
import com.poc.app.model.Booking;
import com.poc.app.model.Flight;
import com.poc.app.model.Hotel;
import com.poc.app.model.User;
import com.poc.app.repository.AgentRepo;
import com.poc.app.repository.BookingRepo;
import com.poc.app.repository.FlightRepo;
import com.poc.app.repository.HotelRepo;
import com.poc.app.repository.UserRepo;

@Component
public class TestBookingClass implements CommandLineRunner{
	
	@Autowired
	BookingRepo bookingRepo;
	
	@Autowired
	AgentRepo agentRepo;
	
	@Autowired
	FlightRepo flightRepo;
	
	@Autowired
	HotelRepo hotelRepo;
	
	@Autowired
	UserRepo userRepo;


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Agent agent = new Agent();
		agent.setAgent_username("fg");
		agent.setPassword("gfgv");
		agentRepo.save(agent);
		
		User user = new User();
		user.setUser_name("sfgvsh");
		user.setContact("shfgs");
		userRepo.save(user);

		
		Flight flight = new Flight();
		flight.setArrival_time("56");
		flight.setDeparture_time("26");
		flight.setDestination("sf");
		flight.setFare(266);
		flight.setFlight_company("fsgs");
		flight.setSource("scgfxg");
		flight.setTotal_hours(35);
		flightRepo.save(flight);
//		--------------------------------
		Flight f2 = new Flight();
		f2.setArrival_time("1300");
		f2.setDeparture_time("1420");
		f2.setDestination("BLR");
		f2.setFare(8000);
		f2.setFlight_company("Lufthansa");
		f2.setSource("PUN");
		f2.setTotal_hours(8);
		flightRepo.save(f2);
//		--------------------------------
		Flight f3 = new Flight();
		f3.setArrival_time("0900");
		f3.setDeparture_time("1020");
		f3.setDestination("KLK");
		f3.setFare(4000);
		f3.setFlight_company("Vistara");
		f3.setSource("MGL");
		f3.setTotal_hours(6);
		flightRepo.save(f3);

		
		Hotel hotel = new Hotel();
		hotel.setHotel_name("shfg");
		hotel.setLocation("sghgd");
		hotel.setPrice_per_night(267);
		hotelRepo.save(hotel);

		
		List<Booking> b1 = new ArrayList<>();
		Booking booking = new Booking();
		booking.setBooking_date("hgsys");
		booking.setFlight(flight);
		booking.setHotel(hotel);
		booking.setInsurance("shghs");
		booking.setTotal_amt(62);
		booking.setUser(user);
		
        b1.add(booking);
//		agent.setBooking(b1);
		user.setBooking(b1);
		hotel.setBooking(b1);
		flight.setBooking(b1);
		
		bookingRepo.saveAll(b1);
		
		
		
	}
}
