package vanisel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobMaxPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/mobile-phones/b/ref=nav_shopall_sbc_mobcomp_all_mobiles?ie=UTF8&node=1389401031");
		driver.findElement(By.xpath("//div[@class='acs-ln-nav-section acs-ln-nav-expanded']//descendant::a[text()='Redmi 5']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'See more')]")).click();
        
	}

}
