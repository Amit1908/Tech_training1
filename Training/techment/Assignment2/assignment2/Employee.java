package com.techment.assignment2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employees
{
	 private int id;
	 private int deptId;
	 private String name;
	 private int salary;
	public Employees(int id, int deptId, String name, int salary) {
		super();
		this.id = id;
		this.deptId = deptId;
		this.name = name;
		this.salary = salary;
	}
	 
	 public int getId() {
		  return id;
		 }
		 public String getName() {
		  return name;
		 }
		 public int getSalary() {
		  return salary;
		 }
		 public int getDeptId() {
		  return deptId;
		 }
	 
}
public class Employee {

	public static void main(String[] args) {
		
		 List < Employees > emp = Arrays.asList(new Employees(1, 1000,
				    "Chandra Shekhar", 6000),
				   new Employees(1, 1000, "Rajesh", 8000), new Employees(1, 1004,
				    "Rahul", 9000), new Employees(1, 1001, "Suresh", 12000),
				   new Employees(1, 1004, "Satosh", 8500));

				  int total = emp.stream().collect(
				   Collectors.summingInt(Employees::getSalary));
				  System.out.println("Total Employees Salary : " + total);

	}

}
