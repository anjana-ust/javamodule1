package oopsday3;

public class Comapre {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		// Comparing primitives
		int a = 10;
		int b= 35;
		boolean result = a==b;
		result = r1 == r2;
		System.out.println(result); //false
		result = t1 ==t2;
		System.out.println(result); // false
		
		// result = r1 == t1;
		// System.out.println(result); // incompatible
		
		Rectangle r3 = r1;
		result = r3 == r1;
		System.out.println(result); // true r3 is refer to r1
		System.out.println(r1.hashCode());
		System.out.println(r3.hashCode());
		System.out.println(r2.hashCode());
		result = r1.equals(r2);
		System.out.println(result); // false
		result = r1.equals(r3);
		System.out.println(result); //true 
		// equals() is not applicable for primitives
		 r1.setLength(35.5);
		 r1.setBreath(75.45);
		 r2.setLength(35.5);
		 r2.setBreath(75.45);
		 if (r1.getBreath() == r2.getBreath() && r1.getLength() == r2.getLength())
			 System.out.println("they have same length and breadth");
		 else
			 System.out.println("they don't have same length and breadth");
		 
		 t1.setS1(35.5);
		 t1.setS2(45.75);
		 t1.setS3(65.5);
		 if(r1.getLength() == t1.getS1())
			 System.out.println("the length and s1 are same");
		 else
			 System.out.println("the length and s1 are not same");
			 
		 
	}
	

}
