package vanisel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
//		List<WebElement> l=driver.findElements(By.tagName("input"));
//		System.out.println(l.size());
//		
//		String s=driver.findElement(By.xpath("//div[@class='_5iyx']")).getText();
//		
//		System.out.println(s);
//		
//		List<WebElement> l1=driver.findElements(By.xpath("//div[@role='contentinfo']//li/a"));
//        System.out.println(l1.size());
//        
        String s1=driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email address')]")).getText();
        System.out.println(s1);
        String s2=driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email address')]")).getAttribute("class");
        System.out.println(s2);
   //     for(int i=0;i<l1.size();i++)
//        {
//        	System.out.println(l1.get(i).getText());
//        	
//        	
//        }
	}

}
