package Methodrefs;

import java.util.Optional;

public class TestOptionals {

	public static void main(String[] args) {
		String str = null;
		String str2 ="hello";
		//Optional<String> optional = Optional.of(str);
		//System.out.println(optional.get());  giving exception
		Optional<String> optional2 = Optional.ofNullable(str);//Suppress exception
		// System.out.println(optional.get()); giving exceptional
		if(optional2.isPresent())
			System.out.println("value  present "+optional2.get()); // if str is passed else is executed and when str2 is passed if is executed
		else
			System.out.println("value not present");
		//System.out.println("is null "+optional2.orElse("str not initialized"));
	
	
	
	
	}

}
