package vanisel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Airlines1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://americanairlines.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("advBookingSearch")).click();
		Thread.sleep(3000);
		book_with_miles("Yes");
		trip("Round trip");
		passengers(4);
		driver.findElement(By.xpath("//input[@id='segments0.origin']")).sendKeys("BLR");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@id='ui-id-12']")).click();
		driver.findElement(By.xpath("//input[@id='segments0.destination']")).sendKeys("HYD");
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//descendant::a[text()='14']")).click();
		
//		Thread.sleep(3000);
//		String TimeOfDay="Morning";
//		driver.findElements(By.xpath("//select[@id='segments0.travelTime']/option[text()='"+TimeOfDay+"']"));
//		
		
	}	
public static void book_with_miles(String book_with_miles)
		
		{
			//String s1="You will be redirected to the US aa.com website.";
			
			driver.findElement(By.xpath("//span[text()='"+book_with_miles+"']")).click();
		
		

	}

public static void trip(String trips)
{
	driver.findElement(By.xpath("//span[text()='"+trips+"']")).click();
}

public static void passengers(int num)
{
	driver.findElement(By.xpath("//select[@id='passengerCount']/option[text()='"+num+"']")).click();
}



}
