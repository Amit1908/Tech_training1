package com.techment;

public class StudentDto {
	
	int StudentId;
	String Name;
	String Dept;
	
	public StudentDto() {
		
	}

	public StudentDto(int studentId, String name) {
		super();
		StudentId = studentId;
		Name = name;
		
	}

	public StudentDto(int studentId, String name, String dept) {
		super();
		StudentId = studentId;
		Name = name;
		Dept = dept;
	}

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
		return "StudentDto [StudentId=" + StudentId + ", Name=" + Name + ", Dept=" + Dept + "]";
	}
	
	
	
	
	
	

}
