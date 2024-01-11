<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateEmp" method="post">
Employe Id: <input type="number" name="eid" id="eid" value="${emp.eid}" /><br>
Employe Name: <input type="text" name="ename" id="ename" value="${emp.ename}"/><br>
Employe Salary: <input type="number" name="esal" id="esal" value="${emp.esal}"/><br>
<button type="submit" name="btn" id="btn">Edit employee</button>
</form>
</body>
</html>