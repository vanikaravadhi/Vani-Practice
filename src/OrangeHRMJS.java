import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class OrangeHRMJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].sendkeys("admin")",driver.findElement(By.id("btnLogin")));
		js.executeScript("document.getElementById('txtUsername').value ='admin';");	
		//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
	
	//js.executeScript("arguments[0].click();",driver.findElement(By.id("btnLogin")));
		
		//driver.findElement(By.xpath("//input[@id='btnLogin']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
WebElement s=driver.findElement(By.xpath("//a[@id='menu_admin_Job']"));
		
   System.out.println(s.isDisplayed());
//		if(s.isDisplayed())
//			System.out.println(s.getText());

		
		

	}

}
