package WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CrmPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		   driver.get("https://crmpro.com");
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.findElement(By.name("username")).sendKeys("anilsatharla");
		   driver.findElement(By.name("password")).sendKeys("anil1234");
		   driver.findElement(By.xpath("//input[@value='Login']")).submit();
		  // driver.switchTo().frame(1);
		   driver.switchTo().frame("mainpanel");
		   driver.findElement(By.xpath("//a[text()='Contacts']")).click();
//		   Actions action=new Actions(driver);
//		   action.moveToElement(driver.findElement(By.xpath("//a[text()='Contacts']"))).click().build().perform();
//		   
		//   driver.findElement(By.xpath("//a[text()='Contacts']")).click();
//		   Actions action=new Actions(driver);
//		   action.move
//		   
		   //Actions action=new Actions(driver);
		   
		   
		   
		   
		
	}

}
