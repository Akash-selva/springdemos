<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>All Product Details</h2>
<core:forEach items="${requestScope.listOfUser}" var="user">
	<span>Name : ${user.name} Salary : ${user.salary} </span><br>
</core:forEach>
<br/>
<a href="Home.jsp">Back</a>
</body>
</html>