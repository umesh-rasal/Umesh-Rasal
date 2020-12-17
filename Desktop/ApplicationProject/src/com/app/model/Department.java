package com.app.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Department {

	private int deptid;
	private String deptname;
	private String deptlocation;
	
	public Department() {
	
	}
	public Department(ResultSet rs) throws SQLException {
		deptid = rs.getInt(1);
		deptname = rs.getString(2);
		deptlocation = rs.getString(3);
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDeptlocation() {
		return deptlocation;
	}
	public void setDeptlocation(String deptlocation) {
		this.deptlocation = deptlocation;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", deptlocation=" + deptlocation + "]";
	}
	
	
}
