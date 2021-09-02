package com.techment.day8.collection;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	String dept;
	int age;
	
	public Employee(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}



	@Override
	public int compareTo(Employee o) {
		if(this.age==o.age)
			return 0;
		else if(this.age>o.age)
			return -1;
		else return 1;
		
	}
	
	
}
public class UserDefinedExample {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"ramesh","hr",34));
		employees.add(new Employee(2,"sachin","manager",45));
		employees.add(new Employee(3,"mahesh","hr",26));
		employees.add(new Employee(4,"manoj","developer",30));
		
		for(Employee emp : employees)
		{
			System.out.println(emp.id+" "+emp.name+" "+emp.dept+" "+emp.age);
		}
		
		Collections.sort(employees);
		System.out.println("****After Sorting****");
		for(Employee emp : employees)
		{
			System.out.println(emp.id+" "+emp.name+" "+emp.dept+" "+emp.age);
		}
		Collections.sort(employees);
		
	}

}
