package com.techment.dao;

import java.util.List;
import com.techment.day10.model.*;
public interface IEmployeeDao {

	Employee getEmployeeById(int id);
	List<Employee> getEmployeeByDept(String dept);
}
