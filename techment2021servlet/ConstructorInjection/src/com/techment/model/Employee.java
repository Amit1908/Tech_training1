package com.techment.model;

public class Employee {
	
	int id;
	String name;
	int Salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	

	public Employee(String name) {
		super();
		this.name = name;
		System.out.println("Name contructor called");
	}


	public Employee(int salary) {
		super();
		Salary = salary;
		System.out.println("Salary contructor called");
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	

}
