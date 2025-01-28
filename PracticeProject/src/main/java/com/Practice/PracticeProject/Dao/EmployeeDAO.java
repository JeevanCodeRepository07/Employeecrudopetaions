package com.Practice.PracticeProject.Dao;

import java.util.List;

import com.Practice.PracticeProject.Model.Employee;

public interface EmployeeDAO {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
	
	void savee(Employee employee);

}
