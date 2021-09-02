package com.techment.day10.utility;


import java.util.HashMap;
import java.util.Map;
import com.techment.day10.model.Employee;
public class CollectionUtil {

	
	static Map<Integer,Employee> employees = new HashMap<Integer,Employee>();
	
	static
	{
		employees.put(1,new Employee(1,"jhon","hr",30000));
		employees.put(2,new Employee(1,"sohan","manager",50000));
		employees.put(3,new Employee(1,"rahul","accountant",35000));
		employees.put(4,new Employee(1,"kohli","md",3000000));
		employees.put(5,new Employee(1,"jadu","ceo",80000));
	}
	
	
	// This method is used to get the employee map,which we initialized as static data.
	
	public static Map<Integer,Employee> getEmployeeList()
	{
		return employees;
	}
}
