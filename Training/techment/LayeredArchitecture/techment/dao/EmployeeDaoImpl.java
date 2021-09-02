package com.techment.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.techment.day10.model.Employee;
import com.techment.day10.utility.CollectionUtil;
import com.techment.day10.utility.CollectionUtil;






public class EmployeeDaoImpl implements IEmployeeDao {

	
	CollectionUtil collectionUtil = new CollectionUtil();
	@Override
	public Employee getEmployeeById(int id) {
		
		Map<Integer,Employee> empMap = collectionUtil.getEmployeeList();
		Employee employee = empMap.get(id);
		
		return employee;
	}

	@Override
	public List<Employee> getEmployeeByDept(String dept) {
		
		// List is declared to store all the employees based on department
		List<Employee> employeeList = new ArrayList<Employee>();
		
		// It returns map data which contains employee details
		Map<Integer,Employee> empMap = collectionUtil.getEmployeeList();
		
		for(Employee employee : empMap.values())
		{
			if(employee.getDept().equalsIgnoreCase(dept))
			{
				employeeList.add(employee);
			}
		}
		return employeeList;
	}

}
