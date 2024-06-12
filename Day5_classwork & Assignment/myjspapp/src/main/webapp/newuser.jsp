<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Voting</title>
</head>
<boddy>
	<h3>$(initparam.appTitle)</h3>
	
	<form method="post" action="register.jsp">
	 FirstName : <input type="text" name=firstName> <br/><br/>
	 lastName : <input type="text" name=lastName> <br/><br/>
	 email : <input type="email" name=email> <br/><br/>
	 password : <input type="Password" name=passwd> <br/><br/>
	 Birth : <input type="date" name=birth> <br/><br/>
	 <input type="submit" Value="Register"/>
	 </form>
	<%-- <% lb.Authenticate(); %>
	<%if(lb.getUser()!=null) {%>
	Welcome, <jsp:getProperty property="email" name="lb"/>
	<jsp:forward page="candlist.jsp"/>
	<%} else { %>
		Login Failed.
	<% } %> 
 --%>
</body>
</html>