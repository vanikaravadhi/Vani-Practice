package Calendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Airlines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vani123\\Practice\\Drivers\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://americanairlines.com");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//input[@id='aa-leavingOn']//following-sibling::button[@class='ui-datepicker-trigger']")).click();
		 driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/descendant::a[text()='27']")).click();
		

	}

}
