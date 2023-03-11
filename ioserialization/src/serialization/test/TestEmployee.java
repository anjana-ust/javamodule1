package serialization.test;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestEmployee {

	public static void main(String[] args) throws Exception {
		Employee  emp = new Employee(101,"John Doe",40000,"nono");
		
	     FileOutputStream fos = new FileOutputStream("emp.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
	}
	

}
