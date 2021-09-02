package com.techment.day10.client;

import java.util.List;
import java.util.Scanner;

import com.techment.day10.model.Employee;
import com.techment.day10.service.EmployeeServiceImpl;
import com.techment.day10.service.IEmployeeService;

public class EmployeeApplication {

	public static void main(String[] args) {
		
		
		IEmployeeService service = new EmployeeServiceImpl();
		System.out.println("=========Employee Application=======");
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println("Enter the id to fetch employee");
		//int id = scanner.nextInt();
		
		
		//Employee employee = service.getEmployeeById(id);
		//System.out.println(employee);
		System.out.println("Enter the dept to fetch employee");
		String dept = scanner.next();
		List<Employee> employees = service.getEmployeeByDept("hr");
		System.out.println(employees);
	}

}
