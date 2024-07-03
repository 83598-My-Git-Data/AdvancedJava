<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
	<h5>
		Welcome to Spring MVC !!!!!
	</h5>
	<h5>
		<c:url var="url" value="/products/view?max=5000&min=500" />
		<a href="${url}">list of Products Within Price Range</a>
	</h5>
</body>
</html>