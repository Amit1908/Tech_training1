package com.techment;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student500")
public class Student {
	
	int StudentId;
	String Name;
	String Dept;
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", Name=" + Name + ", Dept=" + Dept + "]";
	}
	
	

}
