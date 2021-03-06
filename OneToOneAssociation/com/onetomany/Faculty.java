package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student300")
public class Faculty {
	
	
	@Id
	int id;
	String name;
	
	
	@OneToMany
	List<Dept> course;


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


	public List<Dept> getCourse() {
		return course;
	}


	public void setCourse(List<Dept> course) {
		this.course = course;
	}
	
	

}
