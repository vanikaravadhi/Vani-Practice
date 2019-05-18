package TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	

//setup system proeprty for chrome
//login to app
//launching the browser
//enter url
//google test title
//logout from app
//close browser
//delete all the cookies

	
	//preconditions annotations starts with @before
	@BeforeSuite
	
	public void setUp()
	{
		System.out.println("setup system proeprty for chrome");
	}
	
	@BeforeClass
	
	public void launchBrowser()
	{
		System.out.println("launching the browser");
	}
	
	@BeforeTest
	
	public void login()
	{
		System.out.println("login to app");
	
	}
	
	@BeforeMethod
	
	public void enterURL()
	{
		System.out.println("enter url");
	}
	
	//test case starting with @test
	@Test
	public void googleTitleTest()
	{
		System.out.println("google test title");
	}
	
	//post conditions annotations starts with @after
	@AfterMethod
	
	public void logout()
	{
		System.out.println("logout from app");
	}
	
	@AfterTest
	
	public void deleteCookies()
	{
		System.out.println("delete all the cookies");
	}
	
	@AfterClass
	
	public void closeBrowser()
	{
		System.out.println("close browser");
	}
	
	@AfterSuite
	
	public void generateTestReports()
	{
		System.out.println("generate test reports");
	}
		
	
			

}
