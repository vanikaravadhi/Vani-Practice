package vanisel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
//		List<WebElement> all=driver.findElements(By.xpath("//table[@id='customers']//tr/td"));
//		System.out.println("total size of the table:"+all.size());
		String name="Island Trading";
//		for(int i=0;i<all.size();i++)
//		{
//			System.out.println(all.get(i).getText());
//		}
//		
		List<WebElement> col=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		System.out.println(col.size());
		
		List<WebElement> country=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		
		for(int i=0;i<col.size();i++)
		{
			if(col.get(i).getText().equals(name))
			{
			System.out.println(col.get(i).getText()+"-----"+country.get(i).getText());
		}

	}

	}
}
