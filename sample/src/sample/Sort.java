package sample;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	public static void main(String args[]) {
	 ArrayList<Integer> a = new ArrayList<Integer>();
     a.add(1);
     a.add(2);
     a.add(3);
     a.add(4);
     System.out.println(a);
     int largest=a.get(0);
     //System.out.println(largest);
      Collections.sort(a);
      System.out.println();
 
	}         

}
