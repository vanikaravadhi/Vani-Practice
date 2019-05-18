package vanisel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Airlines {
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
		trip("Multi city");
		passengers(4);
		
		
	
		
	}	
		public static void book_with_miles(String book_with_miles)
		
		{
			//String s1="You will be redirected to the US aa.com website.";
			
			driver.findElement(By.xpath("//span[text()='"+book_with_miles+"']")).click();
			WebElement msg=driver.findElement(By.id("domRedirect"));
			
		/*	if(msg.isDisplayed()) {
				msg.getText();
				System.out.println("book_with_miles selected yes"+ book_with_miles    +   msg.getText());
				}
				else
					System.out.println("book_with_miles selected no    "+book_with_miles);
				}*/
		}
			
		//span[text()='Yes']
		
	public static void trip(String trips)
	{
		driver.findElement(By.xpath("//span[text()='"+trips+"']")).click();
	}
	
	public static void passengers(int num)
	{
		driver.findElement(By.xpath("//select[@id='passengerCount']/option[text()='"+num+"']")).click();
	}

}
