package TestLambdas;
@FunctionalInterface
public interface TestInterface {
	public double method();
	public default void method2() {
		System.out.println("from method");
	}
	
public static void method3() {
	System.out.println("from staic method");
}

}
// in functional interface we can define methods with default and static access modifier.