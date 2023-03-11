package TestLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestFunctionalInterfaces {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("Andhra predesh","Tamilnadu","karnadaka","kerala","Telangana");
		
		
		Function<String, Integer> f = (Str) -> {
			return Str.length();
		};
		for(String str :strings) {
			System.out.println(f.apply(str));
		}
		//System.out.println(f.apply("Buneos dias"));
		
		Function<Integer, Integer> f2 = (n) -> {
			return n * n;
		};
		System.out.println(f2.apply(25));
		
		Function<String,String>f3 = (str) ->{
			return str.toUpperCase();
	};
	      System.out.println(f3.apply("Kulathoor ust"));

	
	
	
	
	
	
	
	
	
	}

}
