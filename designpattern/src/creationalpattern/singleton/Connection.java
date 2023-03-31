package creationalpattern.singleton;

public class Connection {
	static Connection con;
	
	private Connection() {
		// out side the class we cannot create object outside the class 
		
	}
	public static Connection getConnection() {
//		if (con != null) {
//			return con;
//		}
//		else
//			con = new Connection();
//		return con;
			return new Connection();
	}
	

}
