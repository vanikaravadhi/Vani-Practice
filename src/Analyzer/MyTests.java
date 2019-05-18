package Analyzer;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class MyTests {

	
	//@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
	@Test
	public void retest()
	{
		
		System.out.println(10/0);
	}
	
	@Test
	
	public void restest1()
	{
		
		System.out.println("hello");
		System.out.println(3/0);
		//Assert.assertTrue(fasle, "this case is failed");
	}
}
