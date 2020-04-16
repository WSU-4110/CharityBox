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
		<title> login </title>
		<meta charset="utf-8">
		<link rel="stylesheet" href="web/charities.css">
		<link href="https://fonts.googleapis.com/css?family=Oswald&display=swap" rel="stylesheet">
		<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
	</head>

<h1>CharityBox</h1>


<body>
	 <!--Navigation Bar-->
    <nav>
        <ul>
            <li><a>FAQ</a></li>
            <li><a href="web/feedbackform.html">Feedback Form</a></li>
            <li><a href="web/contactform.html">Contact Us</a></li>
            <li><a href="index.jsp">Login</a></li>
            <li><a href="web/about.html">About Us</a>
            </li>
            <li><a href="web/index.html">Home</a></li>
        </ul>
    </nav>
   <!--Navigation Bar-->
</body>


<form action = "controller.jsp" method = "GET">
	<input type="submit" value="Initialize" name = "initialize">
	 <input type="hidden" name="FormName" value="Initialize"/>
</form>


<!--form for user to input their username and password.-->


 <form action="controller.jsp" method="POST" >
  Username:<br>
  <input type="text" name="Username"><br>
  Password:<br>
  <input type="text" name="Password"><br><br>
  <input type="hidden" name="FormName" value="Authenticate"/>
  <input type="submit" value="Submit">
</form> 
<% 
		String validateUser = "Valid Inputs";
		if(validateUser.equals(session.getAttribute("ValidUser")))
			{%><h4><font color = "red">New User Created</font></h4> <%}%>
<br><br><hr><br><br>
<h2> New? Sign up here
</h2>

<!--form for new user to input their username and password.-->

 <form action="controller.jsp" method="POST" >
  Username:
  <input type="text" name="Username"><br><br>
  Email: 
  <input type = "text" name="Email"><br><br>
  Password:
  <input type="text" name="Password"><br><br>
  Verify Password:
  <input type="text" name="VerifyPassword"><br><br>
  First Name:
  <input type="text" name="FirstName"><br><br>
  Last Name:
  <input type="text" name="LastName"><br><br>

  
  <input type="hidden" name="FormName" value="NewUser"/>
  <input type="submit" value="Submit">
</form> 
<% 
		validateUser = "Invalid Inputs";
		if(validateUser.equals(session.getAttribute("ValidUser")))
			{%><h4><font color = "red">Invalid Inputs</font></h4> <%}%>
<br><br><br><br><br>

</html>

