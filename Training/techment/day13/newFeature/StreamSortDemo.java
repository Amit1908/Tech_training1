package com.techment.day13.newFeature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.techment.day12.newfeature.Employee;

class AgeComparator implements Comparator<Employee>
{

	
	public int compare(Employee o1,Employee o2) {
		if(o1.getAge()==o2.getAge())
			return 0;
		else if(o1.getAge()>o2.getAge())
			return 1;
		else return -1;
			
		
	}
	
}

public class StreamSortDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "sachin", "developer", 120000, 38));
		employees.add(new Employee(2, "kumar", "hr", 45000, 28));
		employees.add(new Employee(3, "anil", "hr", 55000, 24));
		employees.add(new Employee(4, "john", "manager", 84000, 32));
		employees.add(new Employee(5, "rahul", "hr", 60000, 27));
		employees.add(new Employee(6, "sourab", "developer", 70000, 27));
		employees.stream().forEach(s->System.out.println(s));
		
		employees.forEach(System.out::println);
		
		//employees.stream().sorted().forEach(System.out::println);
		System.out.println("Sorting based on age");
		employees.stream().sorted(new AgeComparator()).forEach(System.out::println);
		
		System.out.println("Sorted by using comparingInt");
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
		
		System.out.println("descending order by using comparingInt");
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(System.out::println);
		
		List<Employee> emp = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
				emp.forEach(System.out::println);
		
		
		
	}

}
