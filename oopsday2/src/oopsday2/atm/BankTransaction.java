package oopsday2.atm;

public class BankTransaction {

	public static void main(String[] args) {
		
		BankingIface bom = new BankOfAmerica();
		double balance = bom.deposit(250);
		System.out.println("balance after deposit = $"+balance);
		balance = bom.withdraw(175.25);
		System.out.println("balance after deposit = $"+balance);
		

	}

}
