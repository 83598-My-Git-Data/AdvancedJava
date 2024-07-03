<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Product List Page</title>
</head>
<body>

	<table style="background-color: lightgrey; margin: auto" border="1">
		<caption>Product by Price ${param.price}</caption>
		<tr>
			<th>Category ID</th>
			<th>Available qty</th>
			<th>name</th>
			<th>Price</th>
			
		</tr>
		<c:forEach var="post" items="${requestScope.product_list}">
			<tr>
				<td>${post.id}</td>
				<td>${post.available_qty}</td>
				<td>${post.name}</td>
				<td>${post.price}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>