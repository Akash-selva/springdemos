<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${requestScope.msg}
<h2>Update User Details</h2>
<form action="updateDetails" method="post">
	<label>Id</label>
	<input type="number" name="id"><br/>
	<label>Salary</label>
	<input type="number" name="salary"><br/>
	<input type="submit" value="submit"/>
	<input type="reset" value="reset"/>
</form>
<br/>
<a href="Home.jsp">Back</a>
</body>
</html>