package TestNGListenerConcept;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;

import com.google.common.io.Files;

public class Base {
	
	static WebDriver driver;
	
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vani123\\Practice\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://google.com");	
		}
	
	public void failed()
	{
		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(scrfile, new File("C:\\Users\\vani123\\Practice\\Selenium\\src\\TestNGListenerConcept\\Screenshots"));
			
		}
		
		catch(Exception e)
		
		{
			e.printStackTrace();
		}
	}

}
