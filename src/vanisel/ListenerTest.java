package vanisel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ListenerTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		
		WebDriver web_driver=new ChromeDriver();
		
		EventFiringWebDriver driver=new EventFiringWebDriver(web_driver);
		MyListener mylistener=new MyListener();
		driver.register(mylistener);
		
		driver.get("http://gmail.com");
		driver.navigate().to("https://amazon.com");
		driver.findElement(By.xpath("//span[text()='Orders']")).click();
		System.out.println("clicking on back button");
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		

	}

}
