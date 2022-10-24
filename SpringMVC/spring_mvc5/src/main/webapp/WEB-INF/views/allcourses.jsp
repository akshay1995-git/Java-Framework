<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- To use JSP expression language to get data from controller to view we need to enable it -->
<%@page isELIgnored="false"%>

<!-- To use JSTL in view jsp required this URI -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
 <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  
<meta charset="ISO-8859-1">
<title>all_detail</title>
</head>
<body>
<span class="border border-success">
	<div>
		<table border="1" >
			<tr>
				<th>Course_ID</th>
				<th>Course_Name</th>
				<th>Course_Duration</th>
				<th>Course_Fees</th>
				<th>Course_Teacher</th>
			</tr>
			<c:forEach var="item" items="${course_list}">
				<tr>
					<td align="center">${item.course_id }</td>
					<td align="center">${item.course_name }</td>
					<td align="center">${item.course_duration }</td>
					<td align="center">${item.course_fees }</td>
					<td align="center">${item.course_teacher }</td>
				</tr>
			</c:forEach>


		</table>

	</div>
	<h4><a href="<spring:url value='/home//'/>">Return To Home</a></h4>
	</span>

  <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>