package com.Practice.PracticeProject.Service;

import java.util.List;

import com.Practice.PracticeProject.Model.Employee;

public interface EmployeeService {
	
List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);

	void savee(Employee employee);
}
