package com.poc.app.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="flight")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flight_id;
	
	private double fare;
	
	private String source;
	
	private String destination;
	

	private String arrival_time;
	
	private String departure_time;
	
	private int total_hours;
	
	private String flight_company;
	
//	@OneToOne(mappedBy = "flight",cascade=CascadeType.ALL)
//	private Booking booking;

	@OneToMany(mappedBy = "flight",cascade=CascadeType.ALL)
	private List<Booking> booking;

	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public String getDeparture_time() {
		return departure_time;
	}

	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}

	public int getTotal_hours() {
		return total_hours;
	}

	public void setTotal_hours(int total_hours) {
		this.total_hours = total_hours;
	}

	public String getFlight_company() {
		return flight_company;
	}

	public void setFlight_company(String flight_company) {
		this.flight_company = flight_company;
	}

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Flight [flight_id=" + flight_id + ", fare=" + fare + ", source=" + source + ", destination="
				+ destination + ", arrival_time=" + arrival_time + ", departure_time=" + departure_time
				+ ", total_hours=" + total_hours + ", flight_company=" + flight_company + ", booking=" + booking + "]";
	}

	public Flight(int flight_id, double fare, String source, String destination, String arrival_time,
			String departure_time, int total_hours, String flight_company, List<Booking> booking) {
		super();
		this.flight_id = flight_id;
		this.fare = fare;
		this.source = source;
		this.destination = destination;
		this.arrival_time = arrival_time;
		this.departure_time = departure_time;
		this.total_hours = total_hours;
		this.flight_company = flight_company;
		this.booking = booking;
	}

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	
}
