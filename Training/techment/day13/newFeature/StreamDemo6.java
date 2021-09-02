package com.techment.day13.newFeature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import com.techment.day12.newfeature.Employee;

public class StreamDemo6 {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "sachin", "developer", 120000, 38));
		employees.add(new Employee(2, "kumar", "hr", 45000, 28));
		employees.add(new Employee(3, "anil", "hr", 55000, 24));
		employees.add(new Employee(4, "john", "manager", 84000, 32));
		employees.add(new Employee(5, "rahul", "hr", 60000, 27));
		employees.add(new Employee(6, "sourab", "developer", 70000, 27));
		employees.stream().forEach(s->System.out.println(s));
		
		//Map<String,Employee> topEmployee = employees.stream().collect(groupingBy(e->e.department,collectingAndThen(maxBy(comparingInt(e->e.salary)),Optional::get)));
		
		Map<String, Employee> topEmployees =
			    employees.stream()
			                .collect(groupingBy(
			                    e -> e.department,
			                    collectingAndThen(maxBy(comparingInt(e -> e.salary)), Optional::get) 
			                ));
		

	}

}
