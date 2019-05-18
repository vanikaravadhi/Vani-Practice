package vanisel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> l=driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		System.out.println(l.size());
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText());
			
			if(l.get(i).getText().equals("java tutorial"))
			{
				l.get(i).click();
			
			
		}
			
			
		
		//for()
		
		

	}

	}
}

