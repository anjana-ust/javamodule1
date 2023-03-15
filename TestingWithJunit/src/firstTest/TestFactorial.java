package firstTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFactorial {
	static calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new calculator();
		System.out.println("Before test executed..");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After executing all tet case");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before each test");
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After each test");
	}

	/*@Test
	public void test() {
		//fail("Not yet implemented");		
	}*/
	
	@Test
	public void testFactorial() {
		int n =5;
		int expectedValue =120;
		int actualValue = calc.factoraial(n);
		assertEquals(expectedValue,actualValue);
		
		
	}

}
