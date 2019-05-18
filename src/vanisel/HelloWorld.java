package vanisel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Hellow World");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> all=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		//WebElement na=driver.findElement(By.xpath(all.getText());
		
		String name="hello world html";
		for(int i=0;i<all.size();i++)
		{
			String names=all.get(i).getText();
			//System.out.println(names);
			
			if(names.equals(name))
					 {
		              
				System.out.println(names);
				
				
			}
			
			
			
			
			
		}
		
		

	}

}
