package com.nagarro.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Flightuser")
public class FlightUser {
	@Id
	@Column(name="uname")
	private String username;
	@Column(name="upass")
	private String password;
	@Column(name="fname")
	private String fullname;
	
	
	
	public FlightUser(String username, String password, String fullname) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
	}
	public FlightUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		//this.fullname = fullname;
	}
	public FlightUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	

}
