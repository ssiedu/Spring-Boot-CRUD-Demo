package com.ssi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssi.dao.EmpDAO;
import com.ssi.entity.Employee;

@RestController
@RequestMapping("/api/")
public class EmpController {
	@Autowired
	private EmpDAO empDAO;
	
	@GetMapping("employees")
	public List<Employee> showAll(){
		return empDAO.findAll();
	}
}
