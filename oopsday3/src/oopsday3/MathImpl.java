package oopsday3;

public class MathImpl implements MathIface {
private int  number1;
private int number2;
	public MathImpl() {
		// TODO Auto-generated constructor stub
		
	}
	

	public MathImpl(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}


	public int getNumber1() {
		return number1;
	}


	public void setNumber1(int number1) {
		this.number1 = number1;
	}


	public int getNumber2() {
		return number2;
	}


	public void setNumber2(int number2) {
		this.number2 = number2;
	}


	@Override
	public int factorial(int n) {
		int fact =1;
		for(int i=1;i<=n;i++)
			fact*=i;
		return fact;
	}

	@Override
	public void primeOrNot(int n) {
		int flag=0;
		
		for(int i=2;i<n;i++)
		{
			
			if(n%i == 0) 
				flag =1;
				break;
		}
		if(flag==1)
					System.out.println(" Not Prime");
		else
			System.out.println("Prime");
					
		
			
		}
		
	

	@Override
	public void oddOrEven(int n) {
		if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
	}

	@Override
	public void positiveOrNot(int n) {
		if(n>0)
			System.out.println("Positive");
		else
			System.out.println("Negative");
		
		
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		
		return a*b;
	}

	@Override
	public double division(int a, int b) {
		return a/b;
	}

	@Override
	public int remider(int a, int b) {
		return a%b;
	}

	@Override
	public int reverse(int n) {
		int rev=0;
		int r=0;
		while(n>0) {
			r = n % 10;
			rev= n*10 +r;
			n=n/10;
		}
		
		
		return rev;
	}

}
