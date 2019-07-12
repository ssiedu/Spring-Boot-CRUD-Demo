package com.ssi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssi.entity.Employee;

@Repository
public class EmpDAOImpl implements EmpDAO {
	
	
	@Autowired
	
	private EntityManager entityManager;
	
	
	@Override
	public List<Employee> findAll() {

		Session session=entityManager.unwrap(Session.class);
		
		Query query=session.createQuery("from Employee",Employee.class);
		List<Employee> employees=query.list();
		return employees;
	}

}
