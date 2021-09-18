package com.techment.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TripzzFlight")
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int Flight_id;
	String Flight_name;
	String Source;
	String Destination;
	int Amount;
	public Flight(int flight_id, String flight_name, String source, String destination, int amount) {
		super();
		Flight_id = flight_id;
		Flight_name = flight_name;
		Source = source;
		Destination = destination;
		Amount = amount;
	}
	public int getFlight_id() {
		return Flight_id;
	}
	public void setFlight_id(int flight_id) {
		Flight_id = flight_id;
	}
	public String getFlight_name() {
		return Flight_name;
	}
	public void setFlight_name(String flight_name) {
		Flight_name = flight_name;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	
	
	

}
