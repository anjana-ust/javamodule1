package oopsday3.overloading;

public class TestMath {
	public static void main(String[] args) {
		 Math math = new Math();
		 int result = math.add(10, 20);
		 System.out.println(result);
		 result=math.add(10, 20, 30);
		 System.out.println(result);
		double  results = math.add(10.5,20.7,80.5);
		System.out.println(results);
		  results = math.add(10L, 20L,30L);
		System.out.println("long result"+results);
		results = math.add(10.25f, 20.20f,89.0);
		System.out.println(results);
		
	}

}
