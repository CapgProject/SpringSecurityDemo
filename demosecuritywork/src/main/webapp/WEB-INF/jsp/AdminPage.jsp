<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fo" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
<div>${message}</div>
<h2>Welcome to Admin Page</h2><br>
<fo:form action="/logout" method="post" id = "myform">
<a onclick="document.getElementById('myform').submit();" href ="#">Logout</a></fo:form>
</body>
</html>