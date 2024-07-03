<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>
		Welcome to spring-mvc!!!
	</h5>
	<h5>
	<c:url var="url" value="/test/multiply?num1=123& num2=456"/>
	<a href="${url}">test model map with request parameters</a></h5>
	<!--  if cookie is disabled jsession id is popped uin url if cookie is enabled url rewrirting wills suprress -->
	<h5>
	<c:url var="url" value="/posts/view?categoryName=category1"/>
	<a href="${url}">List Blog Post by category name </a></h5>
</body>
</html>
<!--  2 additional jar jstl and mysql-->