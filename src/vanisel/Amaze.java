package vanisel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/G/01/amazonglobal/images/Fuji/Dash/2019/January/W_Dresses_1X._CB455677604_SY260_.jpg']")).click();
		//int l1;
//		do
//		{
//			List<WebElement> l=driver.findElements(By.xpath("//li[@class='a-last']"));
//			
			
		//}while(l1!=null);
		

	}

}
