package vanisel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//p[text()='Find the perfect dress for any occasion']//following::a[text()='Shop now']")).click();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.findElement(By.id("pagnNextString")).click();
List<WebElement> Names=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
for(int i=0;i<Names.size();i++) {
	String name_text=Names.get(i).getText();
	System.out.println(name_text);
}

}
}