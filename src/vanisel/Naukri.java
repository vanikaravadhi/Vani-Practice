package vanisel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://naukri.com");
		
		driver.findElement(By.xpath("//a[@href='https://w28.naukri.com/advertiser/bms_hits.php?banner=7301518&othersrcp=']")).click();
		
		Thread.sleep(2000);
		Set<String> handler=driver.getWindowHandles();
		
		Iterator<String> itr=handler.iterator();
		
		String cognizant=itr.next();
		
		System.out.println("Cognizant window id :"+cognizant);
		
		String naukri=itr.next();
		
		System.out.println("naukri window id :"+naukri);
		
		driver.switchTo().window(cognizant);
		
		Thread.sleep(3000);
		//System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.xpath("//p[@class='text-center walkin']")).getText());
		
//		String s=driver.getTitle();
//		
//		if(s.equals("Cognizant"))
//			System.out.println("we are in cognizant window");
//		
//		driver.close();
//		
		

	}

}
