<%@page import="com.app.model.Department" %>
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
	
	<h1>Welcome to Department</h1>
	
	 <table border="1">
		<thead>
		<tr>
			<th>DepartmentID</th>
			<th>Department Name</th>
			<th>Department Location</th>
			</tr>
		</thead>  
		<tbody>
			<c:forEach var="dept1" items="${ departments }">
				<tr>
					<td><a href="ApplicationProject/emp/${ dept1.deptid }">${ dept1.deptid }</a></td>
					<td>${ dept1.deptname }</td>
					<td>${ dept1.deptlocation }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	</body>
</html>