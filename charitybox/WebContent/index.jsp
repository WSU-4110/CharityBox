<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import = "charitybox.jsp.*" %>
<%@ page import = "charitybox.jsp.AuthenticateServlet" %>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 



<html>

<meta charset="ISO-8859-1">
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" href="web/charities.css">
		<link href="https://fonts.googleapis.com/css?family=Oswald&display=swap" rel="stylesheet">
		<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
		<title>CharityBox: Log In</title>
	</head>

<body>
	<h1>CharityBox</h1>
	<!--Navigation Bar-->
    <nav>
        <ul>
            <li><a href="web/frequentlyaskedquestions.html">FAQ</a></li>
            <li><a href="web/feedbackform.html">Feedback Form</a></li>
            <li><a href="web/contactform.php">Contact Us</a></li>
            <li><a href="index.jsp">Login</a></li>
            <li><a href="web/about.html">About Us</a>
            </li>
            <li><a href="web/index.html">Home</a></li>
        </ul>
    </nav>
   <!--Navigation Bar-->

		



<!--form for user to input their username and password.-->

<div class="centerprop">
	<h1> <center> Sign In Here! </center> </h1>
	<p> <center> Existing users, log in here! </center> </p>
		 
	<div class="contactform">
		
		 <!-- <label for="Username"> Email: </label></label>-->
		 <form id="contactform" action="controller.jsp" method="POST" class="form-control">
		  Email:<br>
		  <input type="text" name="Username" class="form-control"><br>
		  Password:<br>
		  <input type="text" name="Password" class="form-control"><br><br>
		  <input type="hidden" name="FormName" value="Authenticate"/>
		  <input type="submit" class="form-control submit" value="Submit">
		</form> 
	</div>
</div>

<%-- 

<% 
		String validateUser = "Valid Inputs";
		if(validateUser.equals(session.getAttribute("ValidUser")))
			{
				%>
					<h4><font color = "red">New User Created</font></h4> 
				<%
			}

%>

 --%>
 
<br><br><hr><br><br>

<!--form for new user to input their username and password.-->
<div class="centerprop">
	<h1> <center> Sign Up </center> </h1>
	<p> <center>  New? Sign Up Here! </center> </p>
		 
	<div class="contactform">
 	
			 <form id="contactform" action="controller.jsp" method="POST" class="form-control">
			  First Name:
			  <input type="text" name="FirstName" class="form-control"><br><br>
			  Last Name:
			  <input type="text" name="LastName" class="form-control"><br><br>
			  Email: 
			  <input type = "text" name="Email" class="form-control"><br><br>
			  Password:
			  <input type="text" name="Password" class="form-control"><br><br>
			  Verify Password:
			  <input type="text" name="VerifyPassword" class="form-control"><br><br>
			  <input type="hidden" name="FormName" value="NewUser"/>
			  <input type="submit" class="form-control submit" value="Submit">
			</form> 
	</div>
</div>

<%-- 
<% 
	validateUser = "Invalid Inputs";
	if(validateUser.equals(session.getAttribute("ValidUser")))
		{
			%>
				<h4><font color = "red">Invalid Inputs</font></h4> 
			<%
		}
%> 
--%>
<br><br><br><br><br>
</body>

</html>

