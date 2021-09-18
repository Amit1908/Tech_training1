package com.techment.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Employee;

@RestController
@RequestMapping("/employeeController")
public class EmployeeController {

	 ArrayList<Employee> employee = new ArrayList<Employee>();

	 public EmployeeController()
	 {
		 employee.add(new Employee(1,"sachin","hr"));
		 employee.add(new Employee(2,"rahul","developer"));
	 }
	
	@GetMapping(value="/showMessage")
	public String display()
	{
		return "this is my first demo";
	}
	
	@GetMapping(value="/getAllEmployee")
	public  ArrayList<Employee> showEmployees()
	{
		
//	    employee = new ArrayList<Employee>();
//		employee.add(new  Employee(1,"sachin", "HR"));
//		employee.add(new  Employee(2,"rahul", "developer"));

		
		return employee;
	}
	
	//@ReqestMapping(method = RequestMethod.Post)
	@PostMapping(value="addEmployee")
	public String addEmployee(@RequestBody Employee employees)
	{
		
		employee.add(employees);
		return "employee added";
	}
	

}