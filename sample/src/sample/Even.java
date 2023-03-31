package sample;

import java.util.ArrayList;

public class Even {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
	     a.add(3);
	     a.add(4);
	     a.add(9);
	     a.add(4);
	     a.add(2);
	     a.add(100);
	     System.out.println(a);
	     /*for(int i=0;i<a.size();i++) {
	    	 if(a.get(i)%2==0) {
	    		 a.remove(i);
	    	 }
	     }*/
	     
	     a.removeIf(num -> num % 2 == 0);
	     System.out.println(a);

	}

}
