import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement scroll=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions act=new Actions(driver);
		int x=scroll.getLocation().x;
		Thread.sleep(3000);
		
		act.clickAndHold(scroll).dragAndDropBy(scroll, x, 300).build().perform();
		
		
		
		
		
		
		

	}

}
