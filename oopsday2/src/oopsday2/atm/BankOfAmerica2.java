package oopsday2.atm;

public class BankOfAmerica2 implements BankingIface2 {
	private Account[] accounts = new Account[5];
	private int accountIntex = 0;

	public BankOfAmerica2() {
		// TODO Auto-generated constructor stub
	}

	public BankOfAmerica2(Account[] accounts) {
		super();
		this.accounts = accounts;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public void addAccount(Account account) {

		if (this.accountIntex < accounts.length)
			accounts[this.accountIntex++] = account;
		else
			System.out.println("Operation not allowed");
	}

	public Account transctionAccount(Account account) {

		return account;
	}

	@Override
	public double withdraw(double amount, int actno) {

		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno) {
				tempBal = accounts[i].getBalance();
				tempBal -= amount;
				accounts[i].setBalance(tempBal);
				break;
			}
		}

		return tempBal;
	}

	@Override
	public double deposit(double amount,int actno) {
		double tempBal=0;
	
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getActno()== actno) {
				tempBal = accounts[i].getBalance();
				tempBal+=amount;
				accounts[i].setBalance(tempBal);
				break;
			}
		}
		return tempBal;
	}
	

	@Override
	public double balanceEnquiry(int actno) {
		double tempBal=0;
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getActno()== actno) {
				tempBal = accounts[i].getBalance();
				break;
			}
		}
				return tempBal;
			
	
	}

}

