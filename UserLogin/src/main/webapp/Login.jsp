<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Login page</h2>
<form action="checkuser"method="post">
<label>Emailid</label>
<input type="email"name="email"><br/>
<label>Password</label>
<input type="password"name="password"><br/>
<input type="submit"name="submit"><br/>
<input type="reset"name="reset"><br/>
</form>
</body>
</html>