package TestNG;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SkipTest {
	
	@BeforeTest
	
	public void skiptest()
	{
		System.out.println("in before test");
		
		throw new SkipException("skipping the test because of some exception");
	}
	
	@Test
	public void test()
	{
		System.out.println("inside test");
	}
	

}
