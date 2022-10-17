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
<title>Insert title here</title>
</head>
<body>
	<h1>By MODEL</h1>
	<h1>Get model data dynamically from controller to views</h1>
	<!-- Use scriptlet tag to get data -->
	<h2>Get data by Scriplet</h2>
	<%
	String name = (String) request.getAttribute("name");
	//getAttribute will return object typecast it into actual
	%>
	<h3>
		Hello
		<%=name%>
		welcome to model
	</h3>
	<h2>Name :<%=name %></h2>
	<hr>
	<h2>Get Data by JSP Expression</h2>
	<h3>Name :${name}</h3>
	<h3>Marks :${marks}</h3>
	
	<hr>
	<h2>Get Data by JSTL</h2>
	<h3>simple List without traversing :${marks}</h3>
	<h3>Traverse through list</h3>
	<!-- required jstl maven dependency  -->
	<c:forEach var="item" items="${marks}">
		<h2>${item}</h2>
	</c:forEach>
</body>
</html>