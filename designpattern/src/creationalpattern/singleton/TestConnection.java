package creationalpattern.singleton;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		//System.out.println(con1.equals(con2)); // singleton ---> create private constructor
		
		if(con1.hashCode()==con2.hashCode()) {
			System.out.println("singleton");
		}
		else
			System.out.println("not singleton");
			

	}

}
