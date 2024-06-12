<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.sunbeam.pojos.Candidate"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Voting</title>
</head>
<body>
	<h1>${initParam.appTitle}</h1>
	<%-- <jsp:useBean id="lb" class="com.sunbeam.myjspapp.LoginBean" scope="session"/>
	Hello , <jsp:getProperty  name="lb" property="email"/> <hr/> --%>
	<jsp:useBean id="rb" class="com.sunbeam.myjspapp.Candidatelistbean"/>
	${rb.fetchCandidates()}
	<form method="post" action="vote.jsp" >
	 <c:forEach var="c" items="${rb.candidateList}">
	 	<input type="radio" name="candidate" value="${c.id}"/> ${c.name} - ${c.party} <br/>
	 </c:forEach>
	 <br/> 
	 <input type="submit" value="Vote"/>
	</form>
</body>
</html>