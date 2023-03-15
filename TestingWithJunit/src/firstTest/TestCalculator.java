package firstTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	
	calculator calc;
	
	@Before
	public void setUp() throws Exception {
		calc = new calculator();
		
	}
	
	
	@Test
	public void testPowerZero() {
		int intBase =0;
		int exp = 0;
		int expectedValue =0;
		int actualValue = (int) calc.power(0, 0);
		assertEquals(expectedValue,actualValue);
	}

	@Test
	public void testPower() {
		
		int inputBase = 2;
		int exp = 3;
		int expectedValue = 8;
	   int  actualValue = (int) calc.power(inputBase, exp);
		assertEquals(expectedValue , actualValue);
		//fail("Not yet implemented");
	
	}
}
