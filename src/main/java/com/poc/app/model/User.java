package com.poc.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
	
	private String user_name;
	
	private String contact;
	
//	@OneToOne(mappedBy = "user",cascade=CascadeType.ALL)
//	private Booking booking;

	@OneToMany(mappedBy = "user",cascade=CascadeType.ALL)
	private List<Booking> booking;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", contact=" + contact + ", booking=" + booking
				+ "]";
	}

	public User(int user_id, String user_name, String contact, List<Booking> booking) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.contact = contact;
		this.booking = booking;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

