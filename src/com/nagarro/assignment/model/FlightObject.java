package com.nagarro.assignment.model;

import java.text.SimpleDateFormat;
import java.text.ParseException;

//import java.text.SimpleDateFormat;
//import java.time.LocalTime;
import java.util.Date;
public class FlightObject {

	private String flightNo;
	private String depLoc;
	private String arrLoc;
	// private String validTill;
	private Date validTill;
	private String date;
	private String flightTime;
	private String flightDur;
	private double fare;
	private String seatAvailibility;
	private String flightClass;

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getDepLoc() {
		return depLoc;
	}

	public void setDepLoc(String depLoc) {
		this.depLoc = depLoc;
	}

	public String getArrLoc() {
		return arrLoc;
	}

	public void setArrLoc(String arrLoc) {
		this.arrLoc = arrLoc;
	}

	public Date getValidTill() {
		return validTill;
	}

	public void setValidTill(String validTill) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date;
		try {
			date = sdf.parse(validTill);
			this.validTill = date;
		} catch (ParseException e) {

			e.printStackTrace();
		}

	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String t) {
		this.flightTime = t;
	}

	public String getFlightDur() {
		return flightDur;
	}

	public void setFlightDur(String flightDur) {
		this.flightDur = flightDur;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public String getSeatAvailibility() {
		return seatAvailibility;
	}

	public void setSeatAvailibility(String seatAvailibility) {
		this.seatAvailibility = seatAvailibility;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date2) {

		this.date = date2;
	}

}
