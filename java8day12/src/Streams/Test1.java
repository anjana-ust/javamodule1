package Streams;

import java.util.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("sun");
		list.add("mars");
		list.add("moon");
		list.add("jupiter");
		list.add("uranus");
		list.add("pluto");
		list.add("venus");
		Predicate<String> p = (str) -> {
			return str.length() > 3 || str.length() < 10;
		};
		
	
		long count = list.stream().filter(p).count();// implicit navigation
		System.out.println(count);
		
		Function<String,String> f=(str)->{
			return str.toUpperCase();
		};
		List<String> outlist = list.stream().map(f).collect(Collectors.toList()); // terminal statement
		System.out.println(outlist);
		//list.stream().forEach(System.out::println); //:: scope resolution
		Consumer<String> c = (str)->{
			System.out.println(str);
		};
		list.stream().forEach(c);
		
		list.stream().filter(p).map(f).forEach(c);
	}
}