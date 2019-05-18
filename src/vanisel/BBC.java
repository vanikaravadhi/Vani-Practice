package vanisel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bbc.com");
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println(l.size());
		
//		WebElement s=l.get(30);
//		System.out.println(s.getText());
//		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText());
		}
		
		

	}

}
