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
<title>Detail</title>
</head>
<body>
	<h2>Thank You !!! U Successfully submit application</h2>
	<h3>Your Data is given below</h3>
	<h2>${addcourse.course_name }</h2>
	<h2>${addcourse.course_duration }</h2>
	<h2>${addcourse.course_fees }</h2>
	<h2>${addcourse.course_teacher }</h2>
</body>
<h3><a href="<spring:url value='/home/'/>">Return To Home</a></h3>
</html>