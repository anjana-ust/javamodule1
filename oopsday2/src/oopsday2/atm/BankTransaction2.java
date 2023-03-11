package oopsday2.atm;

public class BankTransaction2 {
	public static void main(String[] args) {
		Account a1 = new Account(101,"john doe","savings",500);
		Account a2 = new Account(102,"jone doe","savings",900);
		Account a3 = new Account(103,"jason doe","salary",600);
		Account a4 = new Account(104,"jane doe","salary",400);
		Account a5 = new Account(105,"jonas doe","pension",700);
		 BankOfAmerica2 boa = new BankOfAmerica2();
		 boa.addAccount(a1);
		 boa.addAccount(a2);
		 boa.addAccount(a3);
		 boa.addAccount(a4);
	     boa.addAccount(a5);
	     System.out.println(boa.balanceEnquiry(103));
	     double result = boa.deposit(100, 102);
	     System.out.println(result);
	     result = boa.withdraw(50, 104);
	     System.out.println(result);
	     System.out.println(boa.balanceEnquiry(101));
	     System.out.println(boa.balanceEnquiry(105));
	     
}
	
	}
	




