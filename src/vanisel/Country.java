package vanisel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Country {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/gayathri/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/MultiSelection%20(2).html");
		Select s=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		s.selectByValue("England");
		 

	}

}
