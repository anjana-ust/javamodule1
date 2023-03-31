package sample;

import java.util.*;


public class Splitmoney {

	public static void main(String[] args) {

		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount ");
		int amount = sc.nextInt();
		System.out.println("Enter the no.of people");
		int p = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=1;i<=p;i++) {
			System.out.println("Enter amount p "+i+"pay");
			arr.add(sc.nextInt());	
		}
		System.out.println(arr);
		for(int i:arr) {
			 sum=sum+arr.get(i);
			 if(sum==amount) {
				 System.out.println("Success");

	}

		}
	}
}
