package com.techment.day10.service;

import java.util.List;
import com.techment.day10.model.*;

public interface IEmployeeService
{
	 Employee getEmployeeById(int id);
		List<Employee> getEmployeeByDept(String dept);
}