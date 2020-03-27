//Database Connection

public class Contact{

    private static Contact instance=null;
    private SQLConnection conn;
    public String s;


    private Contact() { 
	String host = "localhost";
	String user = "root";
	String pass = "root1234";
	String db = "contract";
	 conn = connectToDatabase(host,user,pass,db);
	if(!conn) {
		s = "Connection Failed";
		return false;
	}

   }

    public static Contact getContact() {
      if (instance== null ) 
		instance = new Contact() ;                           

      return instance;
    }
}

Contact conn=Contact.getContact();
