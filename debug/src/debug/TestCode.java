package debug;

public class TestCode {
	int a=0;
	boolean b;
	int factorial(int n) {
		if(n<1)
			return 1;
		return n*factorial(subtract(n));
		
	}
	int subtract(int n) {
		return n-1;
	}
	 void m1(){
		 
	    System.out.println("from m1");
	  }
	   void m2(){
		   
	     this.b=false;
	    System.out.println("1"+a++);
	    System.out.println("2");
	    System.out.println('3');
	    m1();
	     b=true;
	    System.out.println("4"+a++);
	    System.out.println("5");
	    System.out.println("6"+a--);
	    
	  }

	public static void main(String[] args) {
		new TestCode().factorial(5);

	}

}
