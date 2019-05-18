package vanisel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AirLines2 {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://americanairlines.com");
		 
		oneway("One way");
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']")).sendKeys("HYD");
        driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).sendKeys("BLR");
        Select s=new Select(driver.findElement(By.id("flightSearchForm.adultPassengerCount")));
        s.selectByIndex(1);
	}
	
	public static void oneway(String way)
	{
		driver.findElement(By.xpath("//span[text()='"+way+"']")).click();
	}

}
