package com.app.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.Employee;


@Repository
public class EmployeeDAO {
	
	@Autowired
	private DataSource dataSource;
	public List<Employee>getAllEmployee(int id) {
		
		List<Employee> employees = new ArrayList<Employee>();
		try (Connection conn =dataSource.getConnection()){
			try(Statement stmt = conn.createStatement()){ 
			ResultSet rs = stmt.executeQuery("select empno,empname,empjob,empsal,deptid from employee where deptid = "+id);
			while(rs.next()) {
				Employee emp = new Employee(rs);
				employees.add(emp);
			
			}
			
			}
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		return employees;
		}
}
