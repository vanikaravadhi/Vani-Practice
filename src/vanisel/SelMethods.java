package vanisel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://toolsqa.com/automation-practice-form/");
		 Select s=new Select(driver.findElement(By.xpath("//select[@id='continents']")));
		 //s.selectByIndex(2);
		 s.selectByVisibleText("South America");
		 Thread.sleep(3000);
		 //s.deselectByVisibleText("South America");
		 
//		 String s1="Female";
//		 driver.findElement(By.xpath("//input[@value='"+s1+"']")).click();
//		 //driver.findElement(By.xpath("));
		 
		 
		 
		 
		 
		

	}

}
