package com.manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student300")
public class Stud {
	
	
	@Id
	int id;
	String name;
	
	
	@ManyToOne
	private Coursee course;


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


	public Coursee getCourse() {
		return course;
	}


	public void setCourse(Coursee course) {
		this.course = course;
	}


	
	

}

