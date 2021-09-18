package com.techment.model;

public class University {

	Department dept;
	int noofStudents;
	
	
	
	public void setNoofStudents(int noofStudents) {
		this.noofStudents = noofStudents;
	}


	

	public void setDept(Department dept) {
		this.dept = dept;
	}




	public void displayDeptDetails()
	{
		dept.deptDetails();
		System.out.println("no of students" + noofStudents);
	}
}
