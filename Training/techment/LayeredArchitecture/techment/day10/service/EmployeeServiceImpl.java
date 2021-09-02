package com.techment.day10.service;

import com.techment.dao.EmployeeDaoImpl;
import com.techment.dao.IEmployeeDao;
import com.techment.day10.model.Employee;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {

	IEmployeeDao employeeDao = new EmployeeDaoImpl();
	
	public Employee getEmployeeById(int id)
	{
		return employeeDao.getEmployeeById(id);
	}
	
	public List<Employee> getEmployeeByDept(String dept)
	{
		return employeeDao.getEmployeeByDept(dept);
	}
}
