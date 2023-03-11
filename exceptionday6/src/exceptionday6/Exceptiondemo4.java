package exceptionday6;
import java.sql.*;

public class Exceptiondemo4 {
	 
		/*
		 * try { DriverManager.getConnection(""); // has throws clause } catch
		 * (SQLException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
		static void method() throws SQLException{
			
			throw  new SQLException("connection failed");
		}
		public static void main(String[] args) throws SQLException
		{
			method();
			/*
			 * try { method(); }catch(SQLException e) { e.printStackTrace(); }
			 */
	}
	 

}
