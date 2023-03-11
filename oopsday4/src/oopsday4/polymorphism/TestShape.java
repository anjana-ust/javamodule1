package oopsday4.polymorphism;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Rectangle(10.5,20.5);
		double result = s.area();
		System.out.println(result);
		
		s = new Circle(35.87);
		result = s.area();
		System.out.println(result);
		s=new Square(6.0);
		result = s.area();
		System.out.println(result);
	
	}

}
