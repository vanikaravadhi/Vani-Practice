import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakyMyTripJS {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://makemytrip.com");
		//List<WebElement> allRadios=driver.findElements(By.xpath("//span[@class='tabsCircle appendRight5']"));
		//allRadios.get(1).click();
		
		radios("Round Trip");
	}
	
	public static void radios(String value)
	{
		driver.findElement(By.xpath("//li[text()='"+value+"']")).click();
	}

}
