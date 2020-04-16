package charitybox.jsp;
import charitybox.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import charitybox.jsp.UserClass;


@WebServlet("/DbConnect")
public class DbFunctions extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	

	/**
     * @see HttpServlet#HttpServlet()
     */
    public DbFunctions() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */ 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        System.out.println("inside the servlet");
        PrintWriter out = response.getWriter();
        out.println("it workeddd" + action);
        
        
        // Figure out which button was pressed
        
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public static String printSomething(String test) {
		return test.toLowerCase();
	}
	
	//========================================================
	// CONNECT TO DATABASE
	//========================================================
	public void connect_func() throws SQLException {
        if (connect == null || connect.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            connect = (Connection) DriverManager
  			      .getConnection("jdbc:mysql://127.0.0.1:3306/charityboxdb?"
  			          + "user=john&password=pass1234");
            System.out.println(connect);
            System.out.println("connected to charityboxdb successfully");
        }
    }
	//========================================================
	// DISCONNECT FROM DATABASE
	//========================================================
	  protected void disconnect() throws SQLException {
	        if (connect != null && !connect.isClosed()) {
	        	connect.close();
	        }
	    }
	  
	  
	//========================================================
		// INSERT USER INTO DATABASE
		//========================================================
		  public boolean insertUser(String firstName, String lastName, String email, String password) throws SQLException {
			  
			  connect_func();
			  //store sql statement as string
			  String sql0 = "INSERT INTO Users(Password, Email, FirstName, LastName)\r\n" + 
			  		" VALUES (?, ?, ?, ?)";
			 
			  Boolean rowInserted = false;
			  
			  // create and load prepared statement
			  	preparedStatement = (PreparedStatement) connect.prepareStatement(sql0);
				preparedStatement.setString(1, password);
				preparedStatement.setString(2, email);
				preparedStatement.setString(3, firstName);
				preparedStatement.setString(4, lastName);
				
				try {
				//execute prepared statement
				rowInserted = preparedStatement.executeUpdate() > 0;
			        preparedStatement.close();}
				catch(Exception e) {
					System.out.println(e);
				}
		
			        return rowInserted;
		  }

		  	//========================================================
			// INSERT ORGANIZATION INTO DATABASE
			//========================================================
			  public boolean insertOrg(String orgName, String address,
					  String phoneNum, String email) throws SQLException {
				  
				  connect_func();
				  //store sql statement as string
				  String sql0 = "INSERT INTO Organizations(OrgName, Address, PhoneNum, Email)\r\n" + 
				  		" VALUES (?, ?, ?, ?)";
				 
				  Boolean rowInserted = false;
				 
				  // create and load prepared statement
				  	preparedStatement = (PreparedStatement) connect.prepareStatement(sql0);
					preparedStatement.setString(1, orgName);
					preparedStatement.setString(2, address);
					preparedStatement.setString(3, phoneNum);
					preparedStatement.setString(4, email);
					
					try {
					//execute prepared statement
					rowInserted = preparedStatement.executeUpdate() > 0;
				        preparedStatement.close();}
					catch(Exception e) {
						System.out.println(e);
					}
			
				        return rowInserted;
			  }

			  	//========================================================
				// INSERT DONATION INTO DATABASE
				//========================================================
				  public boolean insertDonation(String address, String email, String donation) throws SQLException {
					  
					  connect_func();
					  //store sql statement as string
					  String sql0 = "INSERT INTO Donations(Address, Email, Donation)\r\n" + 
					  		" VALUES (?, ?, ?)";
					 
					  Boolean rowInserted = false;
					 
					  // create and load prepared statement
					  	preparedStatement = (PreparedStatement) connect.prepareStatement(sql0);
						preparedStatement.setString(1, address);
						preparedStatement.setString(2, email);
						preparedStatement.setString(3, donation);
						
						try {
						//execute prepared statement
						rowInserted = preparedStatement.executeUpdate() > 0;
					        preparedStatement.close();}
						catch(Exception e) {
							System.out.println(e);
						}
				
					        return rowInserted;
				  }
	  

	  /*
	
	//========================================================
	// INSERT CATEGORY INTO DATABASE
	//========================================================
	  public boolean insertCategory(String item, String category) throws SQLException {
		  String sql0 = "INSERT INTO ItemCategories(ItemID, Category) VALUES (" + 
		  		"	(SELECT ID FROM Items WHERE title = ?)," + 
		  		"     ?)";	
		  Boolean rowInserted = false;
		  preparedStatement = (PreparedStatement) connect.prepareStatement(sql0);
			preparedStatement.setString(1, item);
			preparedStatement.setString(2, category);
		
			// try blocks so that the system doesn't crash when sql statements are rejected
			try {
			rowInserted = preparedStatement.executeUpdate() > 0;
	        preparedStatement.close();}
			catch(Exception e) {
				System.out.println(e);}
//	        disconnect();
	        return rowInserted;
	  }


*/
//========================================================
  // big function that just initializes all the necessary
  // tables using other insert functions
//========================================================
	  public boolean initializeDb() throws SQLException{
		  
		 	connect_func();  
	    	//request.getParameter("Username");
		 	
		 	//String sqld1 = "DROP TABLE IF EXISTS Users" ;
		 	//String sqld2 = "DROP TABLE IF EXISTS Organizations";
		 	//String sqld3 = "DROP TABLE IF EXISTS Donations" ;

		 	String sql1 = "CREATE TABLE Organizations(" + 
		 			"OrgName varchar(40) NOT NULL," + 
		 			"Address varchar(40) NOT NULL," + 
		 			"PhoneNum varchar(11) NOT NULL," +
		 			"Email varchar(40) NOT NULL," + 
		 			"PRIMARY KEY(OrgName)," + 
		 			"CHECK (Email like '%_@__%.__%'));";
		 			
		 	String sql2 = "CREATE TABLE Users(" + 
		 			"Password varchar(40) NOT NULL," + 
		 			"Email varchar(40) NOT NULL," + 
		 			"FirstName varchar(40) NOT NULL," + 
		 			"LastName varchar(40) NOT NULL," + 
		 			"PRIMARY KEY(Email)," +
		 			"CHECK (Email like '%_@__%.__%'));";
		 	
		 	String sql3 = "CREATE TABLE Donations(" + 
		 			"Address varchar(40) NOT NULL," + 
		 			"Email varchar(40) NOT NULL," +  
		 			"Donation varchar(40) NOT NULL," +
		 			"PRIMARY KEY(Email)," +
		 			"CHECK (Email like '%_@__%.__%'));";
		 	
		 	//create tables, no need to drop them. 
		 	//we want them to stay updated and not recreate on every new visit to the site
		 	
		 	try {
		 	statement =  (Statement) connect.createStatement();
		 	//statement.executeUpdate(sqld1);
		 	//statement.executeUpdate(sqld2);
		 	//statement.executeUpdate(sqld3);
		 	
		 	statement.executeUpdate(sql1);
		 	statement.executeUpdate(sql2);
		 	statement.executeUpdate(sql3);
		 	
		 	
		 	}
		 	catch(Exception e) {
		 		System.out.println("Initialize failed: " + e);
		 	}
		 	
		 	System.out.println("tables created.");
		 	
		 	DbFunctions test = new DbFunctions();
			// initialize user table
		 	test.insertUser("Evan", "Nguyen", "evan@gmail.com", "pass1234");
		 	test.insertUser("John", "Doe", "john.doe@gmail.com", "johndoe");
		 	test.insertUser("James", "Cold", "james@gmail.com", "jamespass");
		 	
		 	
		 	// initialize orgs table
		
		 	test.insertOrg("Meals on Wheels", "1 First Street", "313-313-313", "mow@gmail.com");
		 	test.insertOrg("Kids Against Hunger", "2 Second Street", "586-586-586", "kah@gmail.com");
			
		 	// insert a donation for the table
		 	test.insertDonation("262 dodson street", "kevin@gmail.com", "2 xl shirts");
	
	        return true;
			
	  }
	  
	//========================================================
	  // authenticate username and password
	//========================================================
	  public boolean authenticate(String username, String password) throws SQLException
	  {
		  connect_func();
		  
		  
		  String sql0 = "SELECT Password FROM Users Where Email = ?";
		  
		  preparedStatement = (PreparedStatement) connect.prepareStatement(sql0);
		  	preparedStatement.setString(1, username);
		  	System.out.println("after ps");
		  
		  String pass = "";
		  try {
		  ResultSet resultSet = preparedStatement.executeQuery();
		 
		  		while(resultSet.next())
		  		{
		  			pass = resultSet.getString("Password");
		  			System.out.println(pass);
		  		}
		  } catch(Exception e) {
			  System.out.println(e);}
		  

		  if(pass.equals(password)){
			  System.out.println("Password matched");
			  return true;}
		  else {
			  System.out.println("Password not matched: " + pass + ", " + password);
			  return false;}
		 
	  }
	
	//========================================================
	// Search for user
	//========================================================
	 public Boolean searchForUsername(String username) throws SQLException{
		 
		 UserClass allUsers = getUsers();
		 List<String> userList = allUsers.getUsername();
		 return userList.contains(username);
		
	 }
	
	
	//========================================================
	// Search for email
	//========================================================
	public Boolean searchForEmail(String email) throws SQLException{
		 
		 UserClass allUsers = getUsers();
		 List<String> emailList = allUsers.getEmail();
		 return emailList.contains(email);
		
	}
	
		
	// =======================================================
	// SEARCH FOR AN ITEM BASED ON THE CATEGORY
	//========================================================
	  public UserClass getUsers() throws SQLException{
		  	connect_func();
		  	UserClass users = new UserClass();
					  
		  	String sql0 = "SELECT * FROM Users";
		  	statement =  (Statement) connect.createStatement();
		  	//Statement statement2 = (Statement) connect.createStatement();
			  
			// try blocks so that the system doesn't crash when sql statements are rejected
			try {
				resultSet = statement.executeQuery(sql0);
					
			// class that holds data for this type of search
			
			List<String> usernameList = new ArrayList<>();
			List<String> emailList = new ArrayList<>();
			
			while(resultSet.next()) {
				usernameList.add(resultSet.getString("UserID"));
				emailList.add(resultSet.getString("Email"));
			    	}
			       
		    users.setUsername(usernameList);
		    users.setEmail(emailList);
		    
		    statement.close();
					}
			catch(Exception e) {
				System.out.println(e);}
			        
			return users;
	
	  }
	  
	    
	
}

