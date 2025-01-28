package com.Practice.PracticeProject.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Practice.PracticeProject.Dao.EmployeeDAO;
import com.Practice.PracticeProject.Model.Employee;
import com.Practice.PracticeProject.Service.EmployeeService;

@RestController
@RequestMapping("/Api")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
@GetMapping("getlist")
	public List<Employee> get(){
		
		return employeeservice.get();
	}

@PostMapping("save")
	public Employee save(@RequestBody Employee employee) {
		 employeeservice.save(employee);
		 return employee;
}

@GetMapping("/employeebyid/{id}")
public Employee get(@PathVariable int id) {
	Employee empobj= employeeservice.get(id);
	if(empobj==null) {
		throw new RuntimeException("Employee with "+id+ " not found");
	}
	return empobj;

	
}
@DeleteMapping("/delete/{id}")
public String delete(@PathVariable int id) {
	 employeeservice.delete(id);
	 return "delete data by id :"+id;
	
}
@PutMapping("update")
public Employee update(@RequestBody Employee employee) {
	 employeeservice.savee(employee);
	 return employee;
}

}


