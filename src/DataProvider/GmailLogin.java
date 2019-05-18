package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailLogin {
	static WebDriver driver;
	
	@BeforeMethod
	public void browser()
	{
	//	System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
		
	@Test(dataProviderClass=ProvideData.class,dataProvider="providingdata")
	
	public void login(String usrid,String pwd)
	{
		//String s=usrid;
		//String s1=pwd;
		
		System.out.println("logining in to facebook");
		driver.findElement(By.id("email")).sendKeys(usrid);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("u_0_2")).submit();
		
	}
		
@AfterMethod
public void close()
{
	driver.close();
	

}

}
