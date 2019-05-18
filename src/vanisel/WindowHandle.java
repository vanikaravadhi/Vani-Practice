package vanisel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("http://popuptest.com");
		driver.findElement(By.xpath("//a[@href='popuptest2.html']")).click();
		
		Thread.sleep(3000);
		Set<String> handler=driver.getWindowHandles();
		
		Iterator<String> itr=handler.iterator();
		
		String parentWindowId=itr.next();
		System.out.println("parent window id :"+parentWindowId);
		
		String childWindowId=itr.next();
		System.out.println("child window id :"+childWindowId);
		
		driver.switchTo().window("childWindowId");
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window("parentWindowId");
		
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		
		
		
	

	}

}
