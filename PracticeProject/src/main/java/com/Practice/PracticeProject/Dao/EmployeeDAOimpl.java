  package com.Practice.PracticeProject.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Practice.PracticeProject.Model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class EmployeeDAOimpl implements EmployeeDAO {
	
	@Autowired
//	SessionFactory sessionFactory;
	private EntityManager entitymanager;
	@Override
	public List<Employee> get() {
		Session currentsession=entitymanager.unwrap(Session.class);
		
		org.hibernate.query.Query<Employee> query=currentsession.createQuery("from Employee",Employee.class);
		List<Employee> list=query.getResultList();
		return list; 
		
		
    }
		
	
	@Override
	public Employee get(int id) {
		Session currentseSession=entitymanager.unwrap(Session.class);
		Employee e= currentseSession.get(Employee.class, id);
		return e;
		
	}

	
	@Override
	public void save(Employee employee) {
		Session currenSession=entitymanager.unwrap(Session.class);
		currenSession.save(employee);
		
	}

	@Override
	public void delete(int id) {
		Session currentSession=entitymanager.unwrap(Session.class);
		Employee e=currentSession.get(Employee.class, id);
		currentSession.delete(e);
		
	}
	public void savee(Employee employee) {
		Session currenSession=entitymanager.unwrap(Session.class);
		currenSession.update(employee);
		
	}

}
