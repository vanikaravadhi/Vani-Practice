package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Pririty {
	
	@Test(priority=1)
	public void LoginTest()
	{
		System.out.println("testing login");
//		Assert.assertTrue(6<1,"error message");
		System.out.println("after assert");
	}
	
	@Test(priority=3,dependsOnMethods= {"LoginTest"})
	public void registerTest()
	{
		System.out.println("registering");
		Assert.assertTrue(6<1,"error message");
		System.out.println("in registertest method");
	}
	
	@Test(priority=1,dependsOnMethods= {"LoginTest","registerTest"})
	public void LogoutTest()
	{
		System.out.println("testing logout");
	}

}
