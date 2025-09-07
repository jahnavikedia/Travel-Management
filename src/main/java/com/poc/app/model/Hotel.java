package com.poc.app.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="hotel")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hotel_id;
	
	private String hotel_name;
	
	private String location;
	
	private double price_per_night;
	
//	@OneToOne(mappedBy = "hotel",cascade=CascadeType.ALL)
//	private Booking booking;

	@OneToMany(mappedBy = "hotel",cascade=CascadeType.ALL)
	private List<Booking> booking;

	public int getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getPrice_per_night() {
		return price_per_night;
	}

	public void setPrice_per_night(double price_per_night) {
		this.price_per_night = price_per_night;
	}

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	public Hotel(int hotel_id, String hotel_name, String location, double price_per_night, List<Booking> booking) {
		super();
		this.hotel_id = hotel_id;
		this.hotel_name = hotel_name;
		this.location = location;
		this.price_per_night = price_per_night;
		this.booking = booking;
	}

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hotel [hotel_id=" + hotel_id + ", hotel_name=" + hotel_name + ", location=" + location
				+ ", price_per_night=" + price_per_night + ", booking=" + booking + "]";
	}

	
	
	
	
}
