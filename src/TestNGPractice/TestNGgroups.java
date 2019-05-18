package TestNGPractice;

import org.testng.annotations.Test;

public class TestNGgroups {
	
	@Test(groups="Test",invocationCount=10)
	
	public void loginTest()
	{
		System.out.println("login test");
	}
	
	@Test(groups="Logo")
	
	public void homePageTest()
	{
		System.out.println("home paage test");
	}
	
	@Test(groups="Test")
	
	public void searchPageTest()
	{
		System.out.println("search paage test");
	}
	
	@Test(groups="Logo")
	
	public void logOutTest()
	{
		System.out.println("logout test");
	}
	
	@Test(invocationTimeOut=2)
	
	public void test1()
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	
	public void test2()
	{
		String s="vani";
		Integer.parseInt(s);
	}
	
	

}
