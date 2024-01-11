<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<th>Employee id</th>
<th>Employee Name</th>
<th>Employee Sal</th>
</tr>
<c:forEach var="emp" items="${list}">
<tr>
<td>${emp.eid}</td> 
<td>${emp.ename}</td>
<td>${emp.esal}</td>
<td><a href="editEmp?eid=${emp.eid}">Edit</a></td>
<td><a href="deleteEmp?eid=${emp.eid}">Delete</a></td>
</tr>
</c:forEach>
<a href="addNewEmp.jsp">Add New Employee</a>
</table>
</body>
</html>