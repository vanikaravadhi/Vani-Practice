package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vani123\\Practice\\Drivers\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).submit();
		 driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		 
		 List<WebElement> table=driver.findElements(By.id("//table[@id='resultTable']/tbody/tr/td"));
		 
		 	 
			/* for(int i=0;i<table.size();i++)
			 {
				 List<WebElement> checkbox=driver.findElements(By.xpath("//input[@name='chkSelectRow[]']"));
				 System.out.println(checkbox.size());
				 //checkbox.get(i).click();
				 break;
			 } */
	List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@name='chkSelectRow[]']"));
				for(int i=0;i<checkboxes.size();i++) {
					
					checkboxes.get(i).click();
					
				}
				 
			 
			 
		 
		 
		 
		 
		 
		 //System.out.println(table.size());
		 
		 
		 
		

	}

}
