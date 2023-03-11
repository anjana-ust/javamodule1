package TestLambdas;

public class Example1 {
	@FunctionalInterface
	interface Shape {
		double area();
		//double perimeter(); //only one functional interface is allowed in lambda
	}

	interface Math {
		double power(int b, int e);
	}
	interface Factorial{
		int fact(int n);
	}

	public static void main(String[] args) {
		
		
		Factorial f =(int n)->{
			int f1=1;
			for(int i=1;i<=n;i++) {
				f1*=i;
			}
			return f1;
			
		};
		int f1=f.fact(5);
		System.out.println(f1);
		
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("from run method");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		
		// build in interface
		Runnable r = () -> {
			for (int i = 1; i < 5; i++) {
				System.out.println("in run method" + i);
			}
		};
		Thread t = new Thread(r);
		t.start();

		Math m = (int b, int e) -> {

			int p = 1;
			for (int i = 1; i <= e; i++) {
				p *= b;
			}
			return p;
		};

		double p = m.power(2, 3);
		System.out.println(p);
		
		Shape s = () -> {
			return 0.0;
		};
		double result = s.area();
		System.out.println(result);
		

	}

}
