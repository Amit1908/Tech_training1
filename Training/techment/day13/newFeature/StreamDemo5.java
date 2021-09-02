package com.techment.day13.newFeature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.techment.day12.newfeature.Employee;

public class StreamDemo5 {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "sachin", "developer", 120000, 38));
		employees.add(new Employee(2, "kumar", "hr", 45000, 28));
		employees.add(new Employee(3, "anil", "hr", 55000, 24));
		employees.add(new Employee(4, "john", "manager", 84000, 32));
		employees.add(new Employee(5, "rahul", "hr", 60000, 27));
		employees.add(new Employee(6, "sourab", "developer", 70000, 27));
		employees.stream().forEach(s->System.out.println(s));
		
		employees.stream().map(e->"Name : "+e.getName()+" Salary :"+e.getSalary()+" Salary increased by 20% = "+(e.getSalary()+e.getSalary()*0.20)).forEach(System.out::println);
		List<Employee>li=employees.stream().collect(Collectors.toList());
				
		StreamDemo5 streamdemo4= new StreamDemo5();
		Long hrsummary=streamdemo4.deptWiseSumSalary(employees,"Developer");
		System.out.println("Total HR Sum Salary: "+hrsummary);
				
	}
	Long deptWiseSumSalary(ArrayList<Employee>employees, String dept)
	{
		Long sumSalary = employees.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		return sumSalary;
	}

}
