package com.app.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.Department;

@Repository
public class DepartmentDAO {
	
	@Autowired
	private DataSource dataSource;
	public List<Department> getAllDepartment() {
		
		List<Department> departments = new ArrayList<Department>();
		try (Connection conn =dataSource.getConnection()){
			try(Statement stmt = conn.createStatement()){ 
			ResultSet rs = stmt.executeQuery("select Deptid,Deptname,Deptlocation from dept");
			while(rs.next()) {
				Department dept1 = new Department(rs);
				departments.add(dept1);
			
			}
			
			}
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		return departments;
		}
}
