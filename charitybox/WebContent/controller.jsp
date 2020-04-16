<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "charitybox.jsp.*" %>
<%@ page import = "charitybox.jsp.AuthenticateServlet" %>
<%@ page import = "charitybox.jsp.DbFunctions" %>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import= "java.util.List" %>
<%@ page import= "java.util.regex.Matcher"%>
<%@ page import= "java.util.regex.Pattern"%>


<%
// ====================================================================
// IMPORTANT VARIABLES
// ====================================================================
String htmlFormName = request.getParameter("FormName");
DbFunctions test = new DbFunctions();
Statement statement = null;
ResultSet results = null;
PrintWriter output = response.getWriter();
String redirectURL;

// get user
Object sessionUserObject = session.getAttribute("Username");
String sessionUser = String.valueOf(sessionUserObject);

test.initializeDb();

switch(htmlFormName) {

// ====================================================================
// AUTHENTICATE CASE
// ====================================================================
  case "Authenticate":
    // code block
    
     // get http parameters
    String username = request.getParameter("Username");
 	String password = request.getParameter("Password");
 	
 	out.println(username + " " + password);
 	
 	// auth will be changed if the password and username match the database
 	Boolean auth = false;
 	
 	//DbConnect test = new DbConnect();
 	
 	// try calling the authenticate function
 	try {
 	// call authenticate function and store boolean value
 	auth = test.authenticate(username, password);
 	}
 	catch(Exception e) { 
 		System.out.println(e);}
 	
 	if(auth == true)
 	{
 		out.println("<br> authenticated: redirect here in future parts");
 		session.setAttribute("Username", username); 
 		redirectURL = "web/index.html";
 		response.sendRedirect(redirectURL);
 	}
 	else {
 	
 		out.println("<br> Incorrect password or username: redirect here in future parts");
 		redirectURL = "index.jsp";
 		response.sendRedirect(redirectURL);
 	}
 	out.println(session.getAttribute("Username"));
 	
    break;
    
// =======================================================
// INITIALIZE CASE
// =======================================================
  case "Initialize":
    // code block
    test.initializeDb();
    redirectURL = "index.jsp";
    response.sendRedirect(redirectURL);
    break;
    
 // =======================================================
 // INITIALIZE CASE
 // =======================================================
  
  case "NewUser":
	  String newPassword = request.getParameter("Password");
	  String verifyPassword = request.getParameter("VerifyPassword");
	  String email = request.getParameter("Email");
	//String newUsername = request.getParameter("Username");
	  String firstName = request.getParameter("FirstName");
	  String lastName = request.getParameter("LastName");
	  
	  Boolean validateEmail = validEmail(email);
	  Boolean emailExists = test.searchForEmail(email);
	//Boolean usernameExists = test.searchForUsername(newUsername);
	  
	  if(/*!usernameExists &&*/ !emailExists && newPassword.equals(verifyPassword) && validateEmail){
		  output.println("new user validated");
	 		test.insertUser(firstName, lastName, email, newPassword);
	 		
	 		// redirect back
			session.setAttribute("ValidUser", "Valid Inputs");
			redirectURL = "index.jsp";
	    	response.sendRedirect(redirectURL);
	  }
	  else{
		// redirect back
			session.setAttribute("ValidUser", "Invalid Inputs");
			redirectURL = "index.jsp";
	    	response.sendRedirect(redirectURL);
		}
	  
	  
 		
	  break;

	// =======================================================
	  // INITIALIZE CASE
	  // =======================================================
	   
	   case "NewDonation":
	 	  String donation = request.getParameter("myAddress"); //switched donation and address parameters because they were out of 
	 	  String donationEmail = request.getParameter("myEmail");
	 	  String donationAddress = request.getParameter("myDonation");//order on the donation form
	 	  //String firstName = request.getParameter("FirstName");
	 	  //String lastName = request.getParameter("LastName");
	 	 
			test.insertDonation(donation, donationEmail, donationAddress);
	 	  	session.setAttribute("ValidUser", "Valid Inputs");
			redirectURL = "web/index.html";
    		response.sendRedirect(redirectURL);
  
	 		break;


}
%>


<%! 
public static boolean validEmail(String email) 
{ 
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                        "[a-zA-Z0-9_+&*-]+)*@" + 
                        "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                        "A-Z]{2,7}$"; 
                          
    Pattern pat = Pattern.compile(emailRegex); 
    if (email == null) 
        return false; 
    return pat.matcher(email).matches(); 
} 
%>

<%
/*
// ========================================================
// ADD DONATION ITEM CASE
// ========================================================
  case "AddItem":
	  output = response.getWriter();
	  output.println("Form submitted: " + htmlFormName);
	  
	  // REFACTOR SO THAT THESE ARE DECLARED AT THE TOP OF THE PAGE
	  // Get parameters from form
	  String ItemName = request.getParameter("ItemName");
	  String Description = request.getParameter("Description");
	  String Category = request.getParameter("Category");
	  String Price = request.getParameter("Price");
	  
	 
	  // call functions to add to database
	  test.insertItem(ItemName, Price, sessionUser, Description);
	  test.insertCategory(ItemName, Category);
	  
	 // test.insertCategory("iPhone", "more trash 2.0");
	  // display item
	  ReturnObject categories = new ReturnObject();
	  categories = test.categorySearch("fruit");
	  List<String> readCat = new ArrayList<>(categories.getCategories());
	  
	  output.println("Printing in the controller jsp!!! " +readCat.get(0));
		break;
*/

// ========================================================
// ADD NEW USER
// ========================================================


 %>