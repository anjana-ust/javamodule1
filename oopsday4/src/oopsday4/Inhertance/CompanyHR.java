package oopsday4.Inhertance;

public class CompanyHR {
	public static void main(String[] args) {
		Employee emp1 = new Employee("John Doe","Male",24,101,"Research",40000);
		System.out.println(emp1);
		Employee emp2 = new Employee("Joly Doe","Female",44,102,"Accounting",50000);
		System.out.println(emp2);
		Employee emp3 = new Employee("Jane Doe","Male",34,103,"Sales",60000);
		System.out.println(emp3);
		Employee emp4 = new Employee("Neha Doe","Female",26,104,"Research",40000);
		System.out.println(emp4);
		Employee emp5 = new Employee("John Doe","Male",24,101,"Research",40000);
		System.out.println(emp5);
		 
		if(emp1.equals(emp5))
		System.out.println("the objects are same");
	    else
	    	System.out.println("the objects are not same");
		
	}

}
