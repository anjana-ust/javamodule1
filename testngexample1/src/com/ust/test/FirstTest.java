package com.ust.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTest {
  @Test(priority=1,description="this is excecuted first")//if priority not given executed in the alphabetical order
  public void f() {
	  System.out.println("from test method f()");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("from before test()");
  }
@Test(priority=2,description="test description")
public void a() {
	System.out.println("from  test method a()");
	
}
  @AfterTest
  public void afterTest() {
	  System.out.println("from after test()");
  }

}
