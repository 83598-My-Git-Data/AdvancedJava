<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Voting</title>
</head>
<body>
	<h3>$(initparam.appTitle)</h3>
	
	<jsp:useBean id="lb" class=com.sunbeam.myjspapp.RegistrationBean></jsp:useBean>
	<jsp:setProperty name="lb" property="*" />
	<jsp:setProperty name="lb" property="status" value=0 />
	<jsp:setProperty name="lb" property="Role" value="voter" />
	${ lb.RegisterUSer() }
	<c:choose>
		<c:when test="${rb.count==1 }">
			Registration successful.
			<a href="index.jsp">Sign In</a>
		</c:when>
		<c:otherwise>
					Registration failed.
					<a href="newuser.jsp">Sign Up</a>
		</c:otherwise>
	</c:choose>
	
</body>
</html>