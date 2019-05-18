package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBBrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("kvani.roopa@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("roopasiva@123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		for(int i=0;i<alllinks.size();i++)
		{
			try {
			String link=alllinks.get(i).getAttribute("href");
			System.out.println(link);
			
			HttpURLConnection con=(HttpURLConnection)new URL(link).openConnection();
			con.setRequestMethod("HEAD");
			
			con.connect();
			int respcode=con.getResponseCode();
			if(respcode>400)				
			{
			
				System.out.println(link+"link is broken");
			
			}
			else
			System.out.println(link+"link is working");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}

	}
	

}
