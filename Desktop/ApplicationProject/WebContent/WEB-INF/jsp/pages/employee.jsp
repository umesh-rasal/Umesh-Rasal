<%@page import="com.app.model.Employee" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Department - Payroll Application</title>
	</head>
	<body>
	
	<h1>Welcome to Employee</h1>
	
	 <table border="1">
		<thead>
		<tr>
			<th>Employee No</th>
			<th>Employee Name</th>
			<th>Employee Job</th>
			<th>Employee Salary</th>
			<th>Department Id</th>
			</tr>
		</thead>  
		<tbody>
			<c:forEach var="emp" items="${ employees }">
				<tr>
					<td>${ emp.empno }</td>
					<td>${ emp.empname }</td>
					<td>${ emp.empjob }</td>
					<td>${ emp.empsal }</td>
					<td>${ emp.deptid }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	</body>
</html>