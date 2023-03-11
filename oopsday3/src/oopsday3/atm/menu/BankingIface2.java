package oopsday3.atm.menu;

import oopsday3.atm.exception.InsufficientFundsException;
import oopsday3.atm.exception.NegativeAmountEception;

public interface BankingIface2 {
	public double withdraw(double amount,int acctno) throws InsufficientFundsException;
	public double deposit(double amount,int acctno) throws  NegativeAmountEception;
	public double balanceEnquiry(int actno);

}
