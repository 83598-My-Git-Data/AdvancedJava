<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Beans</title>
</head>
<body>
	<jsp:useBean id="lb" class="com.sunbeam.myjspapp.LoginBean"/>
	<jsp:setProperty property="email" name="lb" param="email"/>
	<jsp:setProperty property="password" name="lb" param="passwd"/>
	<% lb.Authenticate(); %>
	<%if(lb.getUser()!=null) {%>
	Welcome, <jsp:getProperty property="email" name="lb"/>
	<%} else { %>
		Login Failed.
	<% } %> 
</body>
</html>