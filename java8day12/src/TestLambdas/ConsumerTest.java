package TestLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Andhra predesh", "Tamilnadu", "karnadaka", "kerala", "Telangana");
		Consumer<String> consumer = (str)->{
			System.out.println(str);
		};//will not have return type
	
	consumer.accept("I'm doing great");
	for(String str : strings) {
		consumer.accept(str);
	}
	}

public static void printString(List<String>strings,Consumer<String> c) {
	for(String str : strings) {
		c.accept(str);
	}
	}
}
