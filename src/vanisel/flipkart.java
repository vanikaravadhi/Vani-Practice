package vanisel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("8748998538");
		//driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
		//driver.findElement(By.xpath("//button[text()='Login with Password']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("roopasiva@123");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		

	}

}
