package exceptionday6;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("program begins");
		try {
		int b =Integer.parseInt(args[0]);
		int a =Integer.parseInt(args[1]);
		int c = b/a;
		String name = args[2];
		int data[]= {a,b};
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("program task complete");
	}

}
