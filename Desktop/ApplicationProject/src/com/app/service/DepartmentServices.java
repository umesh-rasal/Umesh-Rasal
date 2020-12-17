package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.DepartmentDAO;
import com.app.model.Department;

@Service
public class DepartmentServices {

	@Autowired
	DepartmentDAO departmentDAO;
	
	public  List<Department> getAllDepartment() {
	return departmentDAO.getAllDepartment();
		}
}
