package com.test2.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee400")
public class Emp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	int id;
	String name;
	public Emp(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	String designation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
	
}
