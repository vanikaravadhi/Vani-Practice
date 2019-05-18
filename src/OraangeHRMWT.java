import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OraangeHRMWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
				driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
				driver.findElement(By.xpath("//input[@id='btnLogin']")).sendKeys(Keys.ENTER);
				
				
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		List<WebElement> table=driver.findElements(By.id("resultTable"));
		System.out.println(table.size());
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table hover']//tr"));
		
		
		String name="john.smith";
		
		for(int i=0;i<rows.size();i++)
		{	
			
			String s=driver.findElement(By.id("resultTable")).getText();
			
			System.out.println(s);
			
			
			if(s.equals(name))
			{
				driver.findElement(By.id("resultTable")).click();				
			}
			
			break;
			
		}		

	}

}
