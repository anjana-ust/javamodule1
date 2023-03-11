package string;

public class TestStrings {

	public static void main(String[] args) {
		byte bytes[] = {65,66,67,68,69};
		String str = new String(bytes);
		System.out.println(str);
		str = "Welcome to UST Global";
		//System.out.println(str.length());
		//System.out.println(str);
		
		bytes=str.getBytes();
		for(byte b : bytes) {
			System.out.println(b);
			
		}
		char chars[] = {'U','S','T',' ','G'};
		str = new String(chars);
		System.out.println(str);
		
		str.getChars(0, chars.length-1, chars, 0);
		for(char c : chars) {
			System.out.println(c);
			
		}
		String string = new String("she sells , sea shells in sea shore ");
		/*(System.out.println(string.split("[.]"));
		String words[] = string.split(" ");
		System.out.println(words.length);
		for (String word : words) {}
		System.out.println(words);
		
		 * int count=0; int len =string.length(); for(int i=0;i<len;i++) {
		 * if(string.charAt(i)==' 9') count+=1; } System.out.println(count);
		 */
		string = new String("cartoon");
		System.out.println(string.startsWith("car"));
		System.out.println(string.endsWith("oon"));
		 int apos = string.indexOf('a');
		 int tpos = string.indexOf('t');
		 String string2 = string.substring(apos, tpos);
		 System.out.println(string2);

		 /*string = new String("madam");
		 int mpos = -1;
		 int dpos = string.indexOf('d', mpos);
		 string2 = string.substring(dpos, mpos);
		 System.out.println(string2);
		 */
		 
		 String email = new String("anjana.as@ust.com");
		 int cpos =email.indexOf('c');
		 int epos = email.indexOf('m');
		 string2 = string.substring(cpos, epos);
		 System.out.println(string2);
		 String str1 = new String("Welcome");
		 String str2 = new String("welcome");
		 boolean result =str1.equals(str2);
		 System.out.println(result);
		 
	}
}

