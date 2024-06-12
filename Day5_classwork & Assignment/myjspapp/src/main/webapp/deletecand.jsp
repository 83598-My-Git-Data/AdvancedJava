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
	<jsp:useBean id="dcb" class="com.sunbeam.myjspapp.DeleteCandidateBean"></jsp:useBean>
	<jsp:setProperty name="dcb" property="id" />
	${dcb.deleteCandidate()}
	<c:redirect url="result.jsp"/>
	
</body>
</html>