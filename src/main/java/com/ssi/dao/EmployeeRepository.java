package com.ssi.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ssi.entity.Employee;

//@RepositoryRestResource(path="emps")//optional to change end point otherwise employees
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
