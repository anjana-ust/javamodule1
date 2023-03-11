package string;

public class New {

	public static void main(String[] args) {
		String str1 = new String("welcome");
		String str2 = new String("Welcome");
		boolean result = str1.equals(str2);
		System.out.println(result);
		
		int val = str2.compareTo(str1);
		System.out.println(val);
		 System.out.println(str1.toUpperCase());
		 System.out.println(str1);
		  
		 String  str = new String("16-11-477/6/A/3 Hyderabad 500036");
		 int alpacount =0;
		 int numcount =0;
		 int symcount = 0;
		 int whitecount=0;
		 for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if (Character.isAlphabetic(ch)==true) {
				alpacount++;
			}
			else if(Character.isDigit(ch)) {
				numcount++;
			}
			else if(Character.isWhitespace(ch)) {
				whitecount++;
				
			}
			else {
				symcount++;
			}
				
		 }
		 System.out.println("letter count "+alpacount);
		 System.out.println("digit count "+numcount);
		 System.out.println("white count "+whitecount);
		 System.out.println("special count "+symcount);
		

	}

}
