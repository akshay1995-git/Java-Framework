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
	<h1>By ModelAndView</h1>
	<!-- use scriplet tag to get data -->
	<%--
	 
      <%  scriptlet tag
	//here we use scriptlet tag to get data from controller 
	//getAttribute will return object typecast it into actual
	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	%>
	JSP Expression
	${key}---jsp expression to get data from controller 
	
	--%>
	<h2>
		Id :
		<%--   <%=id%>  --%>
		${id}
	</h2>
	<h2>
		Name :
		<%--  <%=name%> --%>
		${name}
	</h2>
	<hr>
	<h3>simple List without traversing :${list}</h3>
	<h3>Traverse through list</h3>
	<!-- required jstl maven dependency  -->
	<c:forEach var="item" items="${list}">
		<h2>${item}</h2>
	</c:forEach>

	<h3>This is model and view page</h3>

</body>
</html>