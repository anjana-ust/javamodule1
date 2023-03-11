package exceptionday6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptiondemo1 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
		
			int a =scanner.nextInt();
			int b = scanner.nextInt();
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("cannot / by zero ");
		}catch(InputMismatchException e) {
			System.out.println("Invalid input");
		}
		System.out.println("program completed task");
	}

}
