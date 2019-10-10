<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fo" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
</head>
<body>
<h2>Welcome to User Page</h2>
<fo:form action="/logout" method="post" id = "myform">
<a onclick="document.getElementById('myform').submit();" href ="#">Logout</a></fo:form>
</body>
</html>