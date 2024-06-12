<%@page import="com.sunbeam.myjspapp.UpdateCandidateBean"%>
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
	<h3>${initParam.appTitle}</h3>
	<jsp:useBean id="ucb" class="com.sunbeam.myjspapp.UpdateCandidateBean"/>
	<jsp:setProperty name="ucb" property="*" />
	${ucb.updateCandidate()}
	<c:choose>
	<c:when test="${ucb.count == 1}">
			<c:redirect url="result.jsp"/>
		</c:when>
		<c:otherwise>
			Candidate update failed. <br/><br/>
			<a href="result.jsp">Show Result</a>
		</c:otherwise>
	</c:choose>

</body>
</html>