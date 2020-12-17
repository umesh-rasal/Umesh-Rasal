package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Department;
import com.app.service.DepartmentServices;

@Component
@RequestMapping("/ApplicationProject")
public class DepartmentController {

	@Autowired
   private DepartmentServices DepartmentServices;
	
	@GetMapping
	public ModelAndView loadDepartment(){
		System.out.println("mapping called");
		ModelAndView modelAndView = new ModelAndView("department");
		Department department = new Department();
		
		List<Department> departments = DepartmentServices.getAllDepartment();
		modelAndView.addObject("departments",departments);
		modelAndView.addObject("department", department);
		modelAndView.setViewName("department");
		return modelAndView;
	}
	
	
	
	
}
