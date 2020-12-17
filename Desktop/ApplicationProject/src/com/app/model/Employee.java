package com.app.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee {
	
	private int empno;
	private String empname;
	private String empjob;
	private int deptid;
	private float empsal;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(ResultSet rs) throws SQLException {
		System.out.println(rs);
		empno = rs.getInt(1);
		empname = rs.getString(2);
		empjob = rs.getString(3);
		empsal = rs.getFloat(4);
		deptid = rs.getInt(5);
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpjob() {
		return empjob;
	}

	public void setEmpjob(String empjob) {
		this.empjob = empjob;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public float getEmpsal() {
		return empsal;
	}

	public void setEmpsal(float empsal) {
		this.empsal = empsal;
	}

	@Override
	public String toString() {
		return "Emplyoee [empno=" + empno + ", empname=" + empname + ", empjob=" + empjob + ", deptid=" + deptid
				+ ", empsal=" + empsal + "]";
	}
	
	

}
