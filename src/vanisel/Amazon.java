package vanisel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/G/01/amazonglobal/images/Fuji/Dash/2019/January/W_Dresses_1X._CB455677604_SY260_.jpg']")).click();
		
		List<WebElement> price=driver.findElements(By.xpath("//span[@class='sx-price sx-price-large']"));
		
		List<WebElement> title=driver.findElements(By.xpath("//h2[@class='a-size-medium s-inline s-access-title a-text-normal']"));
		
		System.out.println(price.size());
		
		for(int i=0;i<price.size();i++)
		{
			System.out.println(price.get(i).getText());
			
//			String s=price.get(i).getText();
//			String s1=title.get(i).getText();
//			
//			if(s.equals("$ 88 00"))
//			{
//				System.out.println(s1+" : "+s);
//
//		        //System.out.println();
//				
//				//div[@class='a-row']
//		
//
//	}

}
	}
}
