<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Voting</title>
</head>
<body>
	<h3>${initParam.appTitle}</h3>
	
	<jsp:useBean id="rd" class="com.sunbeam.myjspapp.FindCandidateBean"/>
	<jsp:setProperty name="rd" property="id" param="id"/>
	${rd.findCandidate()}
	
	<form method="post" action="updatecand.jsp">
	<input type="hidden" name="id" value="${rd.candidate.id }"/>
	Name : <input type="text" name="name" value="${rd.candidate.name}"/> <br/><br/>
	Party : <input type="text" name="party" value="${rd.candidate.party}" /> <br/><br/>
	Votes : <input type="text" name="votes" value="${rd.candidate.votes}" /> <br/><br/>
	<input type="submit" value="Update Candidate" />
	</form>
</body>
</html>