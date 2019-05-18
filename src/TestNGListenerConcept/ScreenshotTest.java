package TestNGListenerConcept;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenshotTest extends Base{
	
	static WebDriver driver;
	
	@BeforeMethod
	
	public void setUp()
	{
		initialization();
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	
	public void loginTest()
	{
		Assert.assertEquals(false,true);
	}
	
	
   @Test
	
	public void searchTest()
	{
		Assert.assertEquals(false,true);
	}
   @Test
	
	public void createDealsTest()
	{
		Assert.assertEquals(false,true);
	}
   
   @Test
	
  	public void createContactsTest()
  	{
  		Assert.assertEquals(false,true);
  	}
   
   @Test
	
  	public void HomePageTest()
  	{
  		Assert.assertEquals(false,true);
  	}

}
