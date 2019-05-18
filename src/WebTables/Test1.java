package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).submit();
		 driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.NANOSECONDS);
		 
		 List<WebElement> allData=driver.findElements(By.xpath("//table[@id='resultTable']//thead//th[@rowspan='1']"));
		 allData.addAll(driver.findElements(By.xpath("//table[@id='resultTable']//tbody//tr/td]")));
		 System.out.println(allData.size());
		 
		

	}

}
