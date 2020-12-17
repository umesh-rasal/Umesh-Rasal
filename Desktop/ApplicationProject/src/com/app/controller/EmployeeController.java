package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;
import com.app.service.EmployeeServices;

@Component
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
   private EmployeeServices employeeServices;
	
	@GetMapping("/{id}")
	public ModelAndView loadEmployee(@PathVariable int id){
		System.out.println("mapping is called");
		
		ModelAndView modelAndView = new ModelAndView();
		Employee employee=new Employee();
		
		List<Employee> employees = employeeServices.getAllEmployee(id);
		modelAndView.addObject("employees",employees);
		modelAndView.addObject("employee", employee);
		modelAndView.setViewName("employee");
		return modelAndView;
	}
}
	