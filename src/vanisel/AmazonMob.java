package vanisel;

import java.util.List;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMob {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.in/s?i=electronics&bbn=1389401031&rh=n%3A976419031%2Cn%3A976420031%2Cn%3A1389401031%2Cp_89%3AMi&lo=grid&dc&fst=as%3Aoff&qid=1555590456&rnid=3837712031&ref=sr_pg_1");
		
		//List<WebElement> mob_names=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		List<WebElement> next=driver.findElements(By.xpath("//ul[@class='a-pagination']//li"));
		
for(int i=1;i<next.size();i++) {
	System.out.println("pagenum============="+i);
	List<WebElement> mob_names=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
     for(WebElement names:mob_names) {
	String name=names.getText();
		System.out.println(name);
		
     }
     driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();	
	//continue forloop;
		   
   	

	
		}
	}

}
