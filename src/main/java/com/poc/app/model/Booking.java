package com.poc.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="booking")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int booking_id;
	
	private String booking_date;
	
	private String insurance;
	
	public String getInsurance() {
		return insurance;
	}

	private double total_amt;
	
    //@OneToOne(fetch = FetchType.LAZY)
//	@JsonIgnore
//	@JoinColumn(name="agent_fk")
//	private Agent agent;
	
//	@OneToOne(fetch = FetchType.LAZY)
//	@JsonIgnore
//	@JoinColumn(name="flight_fk")
//	private Flight flight;
//	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JsonIgnore
//	@JoinColumn(name="hotel_fk")
//	private Hotel hotel;
//	
//	@OneToOne(fetch = FetchType.LAZY)
//	@JsonIgnore
//	@JoinColumn(name="user_fk")
//	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="flight_fk")
	private Flight flight;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="hotel_fk")
	private Hotel hotel;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="user_fk")
	private User user;

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public String getBooking_date() {
		return booking_date;
	}

	public void setBooking_date(String booking_date) {
		this.booking_date = booking_date;
	}

	public double getTotal_amt() {
		return total_amt;
	}

	public void setTotal_amt(double total_amt) {
		this.total_amt = total_amt;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	@Override
	public String toString() {
		return "Booking [booking_id=" + booking_id + ", booking_date=" + booking_date + ", insurance=" + insurance
				+ ", total_amt=" + total_amt + ", flight=" + flight + ", hotel=" + hotel + ", user=" + user + "]";
	}

	public Booking(int booking_id, String booking_date, String insurance, double total_amt, Flight flight, Hotel hotel,
			User user) {
		super();
		this.booking_id = booking_id;
		this.booking_date = booking_date;
		this.insurance = insurance;
		this.total_amt = total_amt;
		this.flight = flight;
		this.hotel = hotel;
		this.user = user;
	}

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	
	
	
}
