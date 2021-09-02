package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course300")
public class Dept {
	
	@Id
	int id;
	String courseName;
	int duration;

	public Dept(int id, String courseName, int duration) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.duration = duration;
	}

	
	
	
}
