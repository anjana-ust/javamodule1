package userdefinedobject;
import java.util.*;

public class TestHashMap {
	public static void main(String[] args) {
		
	
	Employee emp1 = new Employee("John Doe","Male",24,101,"Research",40000);
	Employee emp2 = new Employee("Joly Doe","Female",44,102,"Accounting",50000);

	Employee emp3 = new Employee("Jane Doe","Male",34,103,"Sales",60000);
	
	Employee emp4 = new Employee("Neha Doe","Female",26,104,"Research",40000);
	
	Employee emp5 = new Employee("John Doe","Male",24,101,"Research",40000);
	
	HashSet<Employee> empSet = new HashSet<>();
	
	empSet.add(emp1);
	empSet.add(emp2);
	empSet.add(emp3);
	empSet.add(emp4);
	empSet.add(emp5);
	
	TreeSet<Employee> empset = new TreeSet<>();
	
	empset.add(emp1);
	empset.add(emp2);
	empset.add(emp3);
	empset.add(emp4);
	empset.add(emp5);
	
	ArrayList<Employee> empList = new ArrayList<>();
	empList.add(emp5);
	empList.add(emp2);
	empList.add(emp3);
	empList.add(emp4);
	empList.add(emp5);
	 HashMap<String,Collection<Employee>> dataMap = new HashMap<>();
	 dataMap.put("empList", empList);
	 dataMap.put("empSet", empList);
	 dataMap.put("empset", empList);
	 System.out.println(dataMap);
	 System.out.println(dataMap.size());
	 Collection<Employee>list = dataMap.get("empList");
	 Iterator<Employee> iter = list.iterator();
	 while(iter.hasNext()) {
		 System.out.println(iter.next());
		 
	 }
	Collection<Employee> set = dataMap.get("empSet");
	iter = set.iterator();
	 while(iter.hasNext()) {
		 System.out.println(iter.next());
		 
	 }
	 Collection<Employee> tree = dataMap.get("empTreeSet");
		iter = set.iterator();
		 while(iter.hasNext()) {
			 System.out.println(iter.next());
			 
		 }
		 
			

}}
