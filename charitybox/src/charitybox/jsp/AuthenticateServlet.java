package charitybox.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DbServlet
 */
@WebServlet("/Authenticate")
public class AuthenticateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */ 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    	// ignore this
    	String action = request.getServletPath();
    	System.out.println("inside the servlet");
        PrintWriter out = response.getWriter();
        out.println("it worked" + action);
        
        // connect to session
        HttpSession session = request.getSession();
        
        // get http parameters
        String username = request.getParameter("Username");
    	String password = request.getParameter("Password");
    	
    	out.println(username + " " + password);
    	Boolean auth = false;
    	
    	DbFunctions test = new DbFunctions();
    	try {
    	// call authenticate function and store boolean value
    	auth = test.authenticate(username, password);
    	}
    	catch(Exception e) { 
    		System.out.println(e);}
    	
    	if(auth == true)
    	{
    		out.println("authenticated: redirect here in future parts");
    		session.setAttribute("Username", username); 
    	}
    	else {
    		out.println("Incorrect password or username: redirect here in future parts");
    	}
    	out.println(session.getAttribute("Username"));
    	
    	
    	 
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
