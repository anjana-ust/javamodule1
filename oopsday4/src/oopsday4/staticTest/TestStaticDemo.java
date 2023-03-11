package oopsday4.staticTest;

public class TestStaticDemo {
	public static void main(String[] args) {
		System.out.println(StaticDemo.a);
	StaticDemo d = new StaticDemo();
	System.out.println(d.a); 
	StaticDemo d1 = new StaticDemo();
	System.out.println(d1.a);
	StaticDemo d2 = new StaticDemo();
	System.out.println(d2.a);//1 2 3
	System.out.println(StaticDemo.a);// 0 1 2 3 3
//zero if we don't initialize as static , if we put the variable as static then they share the memory and give 20 as output
	
	// d1.a++; 
	// System.out.println(d1.a); //21
	 

	}	

}
