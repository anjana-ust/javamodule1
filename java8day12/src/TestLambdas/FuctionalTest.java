package TestLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FuctionalTest {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Andhra predesh", "Tamilnadu", "karnadaka", "kerala", "Telangana");

		Function<String, Integer> f = (Str) -> {
			return Str.length();
		};
		for (String str : strings) 
			System.out.println(f.apply(str));
		printLength(strings,f);
		
	Function<String,String>f1 =(str)->{
		return str.toUpperCase();
	};
	upperCase(strings,f1);
	Function<String,String>f2 =(str)->{
		return str.toLowerCase();
	
	};
	lowerCase(strings,f2);
	
	Function<String,String>f3 =(str)->{
		StringBuilder string = new StringBuilder(str);
		StringBuilder s =string.reverse();
		return s.toString();
	
	};
	   reverse(strings,f3);
	
	}


//main ends
 public static void printLength(List<String> strings,Function<String,Integer>fref) {
	 for(String str : strings) {
		 System.out.println(fref.apply(str));
	 }
}
 
public static void upperCase(List<String> strings,Function<String,String>fref) {
	for(String str:strings) {
		System.out.println(fref.apply(str));
	}
	
}
public static void lowerCase(List<String> strings,Function<String,String>fref) {
	for(String str:strings) {
		System.out.println(fref.apply(str));
	}
	
}
public static void reverse(List<String> strings,Function<String,String>fref) {
	for(String str:strings) {
		System.out.println(fref.apply(str));
	}
}




}