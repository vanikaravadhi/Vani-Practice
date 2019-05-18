package vanisel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filepopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Alert alert=driver.switchTo().alert();
		//System.out.println(alert.getText());
		//alert.accept();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("Users\\gayathri\\Desktop\\test.txt");
		driver.findElement(By.xpath("//input[@value='submit']")).click();

	}

}
