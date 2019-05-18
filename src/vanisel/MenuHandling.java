package vanisel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		//((JavaScriptExecuter) driver).executeScript("alert('hello')"); //gives alert box
		 JavascriptExecutor js = (JavascriptExecutor) driver;  
		// js.executeScript("alert('hello')"); //gives alert box
		 
		// driver.get("https://crickinfo.com");


	}

}
