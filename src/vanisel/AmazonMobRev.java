package vanisel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobRev {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.in/s?i=electronics&bbn=1389401031&rh=n%3A976419031%2Cn%3A976420031%2Cn%3A1389401031%2Cp_89%3AMi&lo=grid&dc&page=6&fst=as%3Aoff&qid=1555593135&rnid=3837712031&ref=sr_pg_5");
		
		List<WebElement> previous=driver.findElements(By.xpath("//a[(text()='Previous')]"));
		System.out.println(previous.size());
		for(int i=7;i>0;i--)
		{
			System.out.println("page============"+i);
			List<WebElement> mob_name=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
			
			for(WebElement names:mob_name)
			{
				Thread.sleep(2000);
				String name=names.getText();
				System.out.println(name);
			}
			
			driver.findElement(By.xpath("//a[(text()='Previous')]")).click();

		}

	}

}
