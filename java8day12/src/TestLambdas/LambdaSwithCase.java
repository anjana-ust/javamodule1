package TestLambdas;

public class LambdaSwithCase {
	static double calculate(String operator,double x,double y) {
	return switch(operator){
	case "+" -> x+y;
	case "-" -> x-y;
	case "*" -> x*y;
	case "/" -> {
		if(y==0) {
			throw new IllegalArgumentException("can't divide by 0");
			
		}
		yield x/y;
	}
	default -> throw new IllegalArgumentException("Unknown");
	};

}
public static void main(String[] args) {
	
	LambdaSwithCase l = new LambdaSwithCase();
	l.calculate("+", 10, 30);
	l.calculate("-", 10, 30);
	l.calculate("*", 10, 30);
	l.calculate("/", 10, 30);
	l.calculate("/", 10, 0);
	
}
}