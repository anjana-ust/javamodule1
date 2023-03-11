package userdefinedobject;
import java.util.*;

public class TestEmpTreeSet {
	public static void main(String[] args) {
		TreeSet<Employee> empSet = new TreeSet<>();
	   Employee emp1 = new Employee("John Doe","Male",24,101,"Research",40000);
		Employee emp2 = new Employee("Joly Doe","Female",44,102,"Accounting",50000);
	
		Employee emp3 = new Employee("Jane Doe","Male",34,103,"Sales",60000);
		
		Employee emp4 = new Employee("Neha Doe","Female",26,104,"Research",40000);
		
		Employee emp5 = new Employee("John Doe","Male",24,101,"Research",40000);
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		System.out.println(empSet);
		//does not allow dulication;
		
	}

}
