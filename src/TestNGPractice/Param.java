package TestNGPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param {
	
	static WebDriver driver;
	
@BeforeMethod
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vani123\\Practice\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://google.com");			
	}

    @Test
    @Parameters({"id","pwd"})

public void login(String id,String pwd)
{
	//driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("email")).sendKeys(id);
		
	//driver.findElement(By.id("pass")).clear();
	driver.findElement(By.id("pass")).sendKeys(pwd);
	
	driver.findElement(By.id("u_0_2")).submit();
	
}
	

}
