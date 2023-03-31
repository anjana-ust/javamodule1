package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public class Sample {

	public static void main(String[] args) {
		
		/*ArrayList<String> arr = new ArrayList<String>();
		arr.add("hi");
		arr.add("hello");
		arr.add("Welcome");
		System.out.println(arr);
		for(Object obj :arr) {
		 System.out.println(obj);
		}
		Iterator<String> itr = arr.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			// to convert array list to array
		String[] array = new String[arr.size()];
		for(int i=0;i<arr.size();i++) {
			array[i]=arr.get(i);
		}
		for(int i=0;i<arr.size();i++) {
			System.out.println(array[i]);
		}
		System.out.println("-----------");
		//to convert array to arraylist
	System.out.println(Collections.addAll(arr,array));
		/*ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		arr1.add(1);
		arr1.add(2); 
		arr1.add(5);
		for(Object obj1:arr1) {
			System.out.println(obj1);
		}
		String a ="Anjana";
		String b ="Hello";
		StringBuilder sb = new StringBuilder(a);
		sb.append(b);
	
		System.out.println(sb);
		
		to convert array to array list use Collections.addAll
		*/
		HashSet<Integer> hash =new HashSet<Integer>();
		hash.add(1);
		hash.add(2);
		hash.add(3);
		hash.add(9);
		hash.add(8);
		System.out.println(hash);
		for(int i:hash) {
			System.out.println(i);
		}
		HashSet<Integer> hash1 =new HashSet<Integer>();
		hash1.add(4);
		hash1.add(5);
		hash1.add(6);
		for(int element : hash) {
			System.out.println(hash1.contains(element)?"Yes":"No");
		}
		
		

	}
}


