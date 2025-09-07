package com.poc.app.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name="agent")
public class Agent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int agent_id;
	
	private String agent_username;
	
	private String password;

	public int getAgent_id() {
		return agent_id;
	}

	public void setAgent_id(int agent_id) {
		this.agent_id = agent_id;
	}

	public String getAgent_username() {
		return agent_username;
	}

	public void setAgent_username(String agent_username) {
		this.agent_username = agent_username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Agent [agent_id=" + agent_id + ", agent_username=" + agent_username + ", password=" + password + "]";
	}

	public Agent(int agent_id, String agent_username, String password) {
		super();
		this.agent_id = agent_id;
		this.agent_username = agent_username;
		this.password = password;
	}

	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	


	
}
