<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- To use JSP expression language to get data from controller to view we need to enable it -->
<%@page isELIgnored="false"%>

<!-- To use JSTL in view jsp required this URI -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>output</title>
</head>
<body>
	<h2>Thank You !!! U Successfully submit application</h2>
	<h3>Your Data is given below</h3>
	<!-- Method 3 in controller  : ${object_name.variable} -->
	<!-- for method 1 and 2  : ${variable} ---ex ${name}   -->
	<h3>Name : ${application.name }</h3>
	<h3>Email : ${application.email}</h3>
	<h3>Password : ${application.password}</h3>
	<h3>Gender : ${application.gender }</h3>
	<h3>Birth Date : ${application.dob }</h3>
	<h3>Courses :
		<c:forEach var="item" items="${application.course}">
			<h2>${item}</h2>
		</c:forEach>
	</h3>
</body>
</html>