package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	@org.testng.annotations.Test
	public void sample()
	{
	System.setProperty("webdriver.chrome.driver", "src/TestNGPractice/chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	
	driver.get("https://amazon.com");
	

}
}