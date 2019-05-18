package vanisel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://facebook.com");
		//driver.findElement(arg0);
		//driver.manage().window().maximize();
		///driver.findElement(By.id("email")).sendKeys("kvani.roopa@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("roopasiva@123");
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//		driver.get("http://bbc.com");
//		driver.findElement(By.xpath("input[id='orb-search-q']")).sendKeys("vani");
//	
		
		driver.get("http://bbc.com");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nokia");
//		String s=driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
//		System.out.println(s);
//		
//		String x=driver.findElement(By.xpath("//a[@href='https://golfclubs.com/my-account/']")).getAttribute("href");
//		System.out.println(x);
//		
		String x1=driver.findElement(By.xpath("//div[@class='orb-nav-section orb-nav-links orb-nav-focus']//li[@class='orb-nav-sport']/a")).getText();
		System.out.println(x1);
		
		//driver.findElement(By.xpath("))
		
		
		

	}

}
