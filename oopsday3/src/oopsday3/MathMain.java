package oopsday3;

public class MathMain {
	public static void main(String[] args) {
		MathImpl obj = new MathImpl();
		System.out.println("Sum is "+obj.add(3,5));
		System.out.println("Difference is "+obj.subtract(25,5));
		System.out.println("Product is "+obj.multiply(10,20));
		System.out.println("result is " +obj.division(6,3));
		System.out.println("Remainser is "+obj.remider(4, 2));
		System.out.println("Factorial is "+obj.factorial(5));
		obj.oddOrEven(4);
		obj.positiveOrNot(9);
		obj.primeOrNot(13);
		System.out.println("Reverse is"+obj.reverse(123));
		
	}

}
