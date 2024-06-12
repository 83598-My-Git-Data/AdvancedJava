<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>online Voting</title>
</head>
<body>
	<h1>${initParam.appTitle}</h1>
	
	<jsp:useBean id="lb" class="com.sunbeam.myjspapp.VoteBean"></jsp:useBean>
	<%-- <jsp:setProperty name="lb" property="user" param="user"/> --%>
	<%-- <jsp:setProperty name="lb"  property="message" param="message"/> --%>
	${lb.RegisterVote()}
	<c:choose>
		<c:when test="${lb.user.status == 0}">
		Hello, Voter Thanks For Voting. --%>
		<a href="logout.jsp">Sign Out</a>	
		</c:when>
		<c:otherwise>
		You Have Already Voted.
		<a href="logout.jsp">Sign Out</a>		
		</c:otherwise>
	</c:choose>
	

</body>
</html>