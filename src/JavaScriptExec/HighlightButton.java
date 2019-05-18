package JavaScriptExec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightButton {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("kvani.roopa@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("roopasiva@123");
		WebElement btn=driver.findElement(By.id("u_0_3"));
		flash(btn,driver);
	}
	
	public static void flash(WebElement ele,WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgcolor=ele.getCssValue("backgroundcolor");
		
		for(int i=0;i<100;i++)
		{
			
			changeColor("rgb(0,200,0)",ele,driver);
			changeColor(bgcolor,ele,driver);
			
		}	
	}
	
	public static void changeColor(String color,WebElement ele,WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundcolor='"+color+"'",ele);
		
		try {
			Thread.sleep(3000);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
