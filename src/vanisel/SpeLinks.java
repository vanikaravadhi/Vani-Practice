package vanisel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpeLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bbc.com");
		
		WebElement links=driver.findElement(By.xpath("//div[@role='contentinfo']"));
		
		//System.out.println(links.());
//		List<WebElement> li=driver.findElements(By.xpath("By.xpath(\"//div[@role='contentinfo']//li/a"));
//
//		System.out.println(li.size());
//		
//		for(int i=0;i<li.size();i++)
//		{
//			li.get(i).click();
//			System.out.println(driver.getTitle());
//			
//			 links=driver.findElement(By.xpath("//div[@role='contentinfo']"));
//			
//			 li=driver.findElements(By.xpath("By.xpath(\"//div[@role='contentinfo']//li/a"));
//			 System.out.println("*******");
			
		}
	}


