package Analyzer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Samplee {
	static WebDriver driver;
	@Test
	@Parameters("browser")
public static void launching_browser(String browser) {
		
		switch (browser) {
		case "ie":
			System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			break;
		default:
			break;
		}
		driver.get("https://google.com");
		//driver.findElement(By.className("q")).sendKeys("java");
}
}
