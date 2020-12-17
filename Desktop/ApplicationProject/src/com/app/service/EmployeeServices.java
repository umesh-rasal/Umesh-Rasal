package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeDAO;
import com.app.model.Employee;

@Service
public class EmployeeServices {

	@Autowired
	EmployeeDAO employeeDAO;
	
	public List<Employee> getAllEmployee(int id) {
	return employeeDAO.getAllEmployee(id);
		}
}
