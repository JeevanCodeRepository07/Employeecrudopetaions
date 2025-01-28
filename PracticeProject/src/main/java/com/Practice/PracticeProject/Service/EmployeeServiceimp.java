package com.Practice.PracticeProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Practice.PracticeProject.Dao.EmployeeDAO;
import com.Practice.PracticeProject.Model.Employee;

import jakarta.transaction.Transactional;


@Service
public class EmployeeServiceimp implements EmployeeService {

	@Autowired
	EmployeeDAO employeedao;
	@Transactional
	@Override
	public List<Employee> get() {
		return employeedao.get();
	}
	@Transactional
	@Override
	public Employee get(int id) {
		return employeedao.get(id);
	}
	@Transactional
	@Override
	public void save(Employee employee) {
		employeedao.save(employee);
		
	}
	@Transactional
	@Override
	public void delete(int id) {
		employeedao.delete(id);
		
	}
	@Transactional
	@Override
	public void savee(Employee employee) {
		employeedao.savee(employee);
		
	}

}
