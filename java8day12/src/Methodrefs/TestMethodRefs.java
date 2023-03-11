package Methodrefs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

interface Formula{
	public void m1();
}
class some{
	public  static void m2() {
		System.out.println("from m2....");
	}
}

class other{
	other(){
		System.out.println("from other constructor");
	}
	void m2(String str) {
		System.out.println("from m2()");
	}
}

public class TestMethodRefs {

	public static void main(String[] args) {
		
		Formula f = some::m2; // :: method reference in java 8 it has 3 uses constructor,instances and static method
		f.m1();//m1 call m2 internally
		
		f = other::new;// constructor
		List<String> list = Arrays.asList("one","two","three");
		list.stream().forEach(System.out::println);// instance method reference
		List<Integer> intList = Arrays.asList(12,13,34,87);
		Optional<Integer> num =intList.stream().reduce(Math::max); //static reference
		System.out.println(num.get());
		
		 

	}

}
