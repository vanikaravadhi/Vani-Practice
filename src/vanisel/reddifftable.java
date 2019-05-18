package vanisel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reddifftable {

	 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		List<WebElement> col1=driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));
		System.out.println(col1.size());
		
		List<WebElement> col5=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[5]"));
		
//		String part1="//table[@class='dataTable']//tbody//tr[";
//		String part2="]//td[4]";
//		
//		int i=1;
//		while(isElementPresent(part1+i+part2))
//		{
//			String s=driver.findElement(By.xpath(part1+i+part2)).getText();
//			System.out.println(s);
//			i++;
//		}
		
		String name="Wipro Ltd";
		
		
		for(int i=0;i<col1.size();i++)
		{
			if(col1.get(i).getText().equals(name))
			{
			System.out.println(col1.get(i).getText()+"---------"+col5.get(i).getText());
			WebElement cell=col1.get(i);
			//cell.findElement(By.tagName("a")).click();
			cell.findElements(By.tagName("a")).get(0).click();
			break;
			
			
		}
				
		
		
		
	}
	
//	public static boolean isElementPresent(String ele)
//	{
//		int size=driver.findElements(By.xpath(ele)).size();
//		
//		if(size>0)
//			return true;
//		
//		else
//			return false;
//	}


}
	
}
