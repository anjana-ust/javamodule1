package firstTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testoddoreven {
	static calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc=new calculator();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	@Test
   public void testoddoreven() {
	   int n=2;
	   boolean actualValue=true;
	   boolean expectedValue=calc.oddoreven(n);
	   assertEquals(actualValue,expectedValue);
	   
   }
}
