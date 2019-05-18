package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class NewTest {
  @Test
  public void testEmail() {
	  
	  System.out.println("this is in new test");
  }
  
  
  @BeforeTest
  public void Btest() {
	  
	  System.out.println("this is Btest in new test");
  }

}
