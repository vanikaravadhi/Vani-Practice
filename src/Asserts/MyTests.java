package Asserts;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class MyTests {
	
	//SoftAssert softassert=new SoftAssert();
	
	@Test
	
	public void test1()
	{
		SoftAssert softassert=new SoftAssert();
		System.out.println("open browser");
		//Assert.assertEquals(true,false);
		Assert.assertEquals(true,true);
		
		System.out.println("enter user name");
		
		//Assert.assertEquals(true,false);
		Assert.assertEquals(true,true);
		
		System.out.println("enter passward");
		System.out.println("click on sign in button");
		//Assert.assertEquals(true,false);
		softassert.assertEquals(true, false);
		
		System.out.println("validate home page");
		
		softassert.assertEquals(true, false);
		
		System.out.println("go to deals page");
		System.out.println("create a deal page");
		//Assert.assertEquals(true,true);
		
		softassert.assertEquals(true, false);
			
		
		System.out.println("go to contact page");
		System.out.println("create a contact page");
		
		//softassert.assertAll();
		softassert.assertAll();
		
	
	}
	
	@Test
	
	public void test2()
	{
		SoftAssert softassert1=new SoftAssert();
		System.out.println("in test2");
		softassert1.assertEquals(true, false,"this is not a valid test");
		softassert1.assertAll();		
	}
	
	@AfterTest
	
	public void test3()
	{
		System.out.println("in after test method");
		//softassert.assertAll();
		
		
	}
	
	
	

}
