package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
	
  @Test
  public void testSendEmail() {
	
	  System.out.println("this is testing send email");
	  
	  
  }
  
  @Test
  
  public void testReceiveEmail()
  {
	  System.out.println("this is testing receive Email");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("after method");
  }

//  @AfterClass
//  public void afterClass() {
//  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("after suite");
  }

}
