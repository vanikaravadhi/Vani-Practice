package vanisel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://spicejet.com/");
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//li[@id='header-addons']"))).build().perform();
		
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//a[contains(text(),'Visa Services')]")).click();
//	    System.out.println(driver.getTitle());
//		
//		Set<String> handler=driver.getWindowHandles();
//		Iterator<String> itr=handler.iterator();
//		String childwindowid=itr.next();
//		driver.switchTo().window(childwindowid);
//		System.out.println(driver.getTitle());
//		
		//Actions action1=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='SpiceClub Members']"))).build().perform();
		
		

	}

}
