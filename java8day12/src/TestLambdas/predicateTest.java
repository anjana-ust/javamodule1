package TestLambdas;
import java.util.function.*;
import java.util.Arrays;
import java.util.List;

public class predicateTest {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Andhra predesh", "Tamilnadu", "karnadaka", "kerala","telengana");
 
		
		Predicate<String> p = (String str) ->{
			return str.length() > 10;
		};
		System.out.println(p.test("hello"));
		for(String str : strings)
		System.out.println(p.test(str));
	}	
		public static void desiredLength(List<String> strings,Predicate<String>p) {
			for(String str : strings)
			System.out.println(p.test(str));
		
	}

}
