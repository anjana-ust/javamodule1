package debug;

public class TestCode2 {
	int a;
	int b;
	int x;
	int a1[]= {2,5,7,8,5};
	int b1[]= {23,43,27,32,12};
	int x1[]= {18,19,20,21,22};
	void eqn() {
	for(int i=0;i<5;i++) {
		a=a1[i];
		b=b1[i];
		x=x1[i];
		
	System.out.println((a*(x*x))+(b*(x*x))+(2*a*b));
		
				
			}

	

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestCode2().eqn();
	}

}
