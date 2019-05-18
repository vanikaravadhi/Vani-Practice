package TestNGPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	
	static WebDriver driver;
	
	@BeforeMethod
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vani123\\Practice\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://google.com");			
	
	}
	
	@Test(priority=1,groups="Title Test")
	
	public void googleTitleTest()
	{

		String title=driver.getTitle();
		System.out.println(title);
	
	}
	
	@Test(priority=2,groups="Logo Test",enabled=false)
	
	public void googleLogoTest()
	{
		boolean b=driver.findElement(By.id("hplogo")).isDisplayed();
	}
	
	@Test(priority=3,groups="Link Test")
	
	public void nailLintTest()
	{
		boolean b=driver.findElement(By.className("vdLsw gsfi")).isDisplayed();
	}
	
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test(priority=4,groups="Test",enabled=false)
	public void test1()
	{
		System.out.println("in test1");
	}
	
	@Test(priority=5,groups="Test")
	public void test2()
	{
		System.out.println("in test2");
	}
	
	@Test(priority=6,groups="Test")
	public void test3()
	{
		System.out.println("in test3");
	}
	

}
