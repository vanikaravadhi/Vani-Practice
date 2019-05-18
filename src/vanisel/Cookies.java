package vanisel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https:://gmail.com");
		Set<Cookie> co=driver.manage().getCookies();
		System.out.println("total cookies"+co.size());
		
		Iterator<Cookie> itr=co.iterator();
		while(itr.hasNext())
		{
			Cookie c=itr.next();
			System.out.println(c.getDomain()+"------"+c.getName()+"-------"+c.getValue());

		
		}
		
		
		

	}

}
