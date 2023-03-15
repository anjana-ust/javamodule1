package TestException;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTeller {
	@Test(expected = InvalidTransactionAmountException.class)
public void testValidateNegativeAmount() {
		Teller.validateTransaction("EUR", -100);
	}
	@Test(expected =IllegalArgumentException.class)
	public void testValidUnacceptedCurrency() {
		Teller.validateTransaction("AUSD", 100);
	}

}
