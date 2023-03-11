package oopsday3.atm.menu;

import java.util.*;

import oopsday3.atm.exception.InsufficientFundsException;
import oopsday3.atm.exception.NegativeAmountEception;

public class BankMenu {

		BankOfAmerica2 boa = new BankOfAmerica2();
		
		 public BankMenu(){
			 Account a1 = new Account(101,"john doe","savings",500);
				Account a2 = new Account(102,"jone doe","savings",900);
				Account a3 = new Account(103,"jason doe","salary",600);
				Account a4 = new Account(104,"jane doe","salary",400);
				Account a5 = new Account(105,"jonas doe","pension",700);
				boa.addAccount(a1);
				 boa.addAccount(a2);
				 boa.addAccount(a3);
				 boa.addAccount(a4);
			     boa.addAccount(a5);
			 
		 } 
	 
		   		
	public void menu() {	
		
	
		Scanner scanner = new Scanner(System.in);
		int choice=0;
		
   	loop :do {
   		System.out.println("Enter your choice 1...2");
   		System.out.println("1.Create  account");
   		System.out.println("2.Deposit Amount");
   		System.out.println("3.Withdraw Amount");
   		System.out.println("4.Display balance");
   		System.out.println("Exit M E N U");
   		
   		choice = scanner.nextInt();
   	switch(choice) {
   	case 1: {
   		System.out.println("Enter account number");
   		int actno = scanner.nextInt();
   		boa.dispalyAccount(actno);
   		
   			break;
   			}
   	
   	case 2:{ 
   		System.out.println("Enter account number");
   		int actno = scanner.nextInt();
   		System.out.println("Enter the amount to deposit ");
   		int amount=scanner.nextInt();
   		double balance=0;
		try {
			balance = boa.deposit(200, 101);
		} catch (NegativeAmountEception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		System.out.println(balance);
   		break;
   	}
   	case 3:{
   		System.out.println("Enter account number");
   		int actno = scanner.nextInt();
   		System.out.println("Enter the amount to withdraw ");
   		int amount=scanner.nextInt();
   		double balance=0;
		try {
			balance = boa.withdraw(300, 101);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		System.out.println(balance);
   		
   		
   			
   	break;
   	}	
   	case 4:{
   		
   		break;
   	}
   	case 5:{
   		break loop;
   	}
   	}	
   	}while(choice!=5);
   
} 	
}
	

