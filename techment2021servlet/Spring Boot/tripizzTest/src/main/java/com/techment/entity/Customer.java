package com.techment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tripizzCustomer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int Customer_id;
	String Customer_name;
	String password;
	String city;
	String state;
	long zip;
	String country;
	public Customer(int customer_id, String customer_name, String password, String city, String state, long zip,
			String country) {
		super();
		Customer_id = customer_id;
		Customer_name = customer_name;
		this.password = password;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	public int getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}
	public String getCustomer_name() {
		return Customer_name;
	}
	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
