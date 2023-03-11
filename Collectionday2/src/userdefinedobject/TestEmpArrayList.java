package userdefinedobject;
import java.util.*;

public class TestEmpArrayList {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
	   Employee emp1 = new Employee("John Doe","Male",24,101,"Research",40000);
		Employee emp2 = new Employee("Joly Doe","Female",44,102,"Accounting",50000);
	
		Employee emp3 = new Employee("Jane Doe","Male",34,103,"Sales",60000);
		
		Employee emp4 = new Employee("Neha Doe","Female",26,104,"Research",40000);
		
		Employee emp5 = new Employee("John Doe","Male",24,101,"Research",40000);
		empList.add(emp5);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		System.out.println(empList);
		
		
	}

}
