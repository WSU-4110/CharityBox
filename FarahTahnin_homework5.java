//Database Connection

public class Contract{

    private static Contract instance=null;
    private SQLConnection conn;
    public String s;


    private Contract() { 
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

    public static Contract getContract() {
      if (instance== null ) 
		instance = new Contract() ;                           

      return instance;
    }
}

Contract conn=Contract.getContract();
