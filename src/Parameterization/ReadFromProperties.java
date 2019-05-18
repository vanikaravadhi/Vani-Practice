package Parameterization;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromProperties {
	
	static WebDriver driver;
	
	public static HashMap<String,String> readProperties()
	{
		String file="C:\\Users\\vani123\\Practice\\Selenium\\ConfigProperties\\Sample.properies";
		
		HashMap<String,String> propertyData=new HashMap<String,String>();
	
		try {
		FileInputStream fin=new FileInputStream(file);
		Properties p=new Properties();
		
		p.load(fin);
		Set<Object> allKeys=p.keySet();
//		Iterator<Object> itr=allKeys.iterator();
//		String s=itr.next();
		
		System.out.println(allKeys);
		
		for(Object key:allKeys)
		{
			String value=p.getProperty(key.toString());
			System.out.println(value);
			propertyData.put(key.toString(), value);
		}
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	//	System.out.println(propertyData);
		return propertyData;
		
	}
		
public static void main(String[] args) {
	
HashMap<String, String>	retrieveData=readProperties();
System.out.println(retrieveData);


String browser=retrieveData.get("browser");
switch(browser)
{
case "chrome": 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vani123\\Practice\\Drivers\\chromedriver.exe");
	 driver =new ChromeDriver();
	break;
	
case "IE" :
	
	System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
	driver =new ChromeDriver();
	break;


}

driver.get(retrieveData.get("url"));

   driver.findElement(By.id("email")).sendKeys(retrieveData.get("user_name"));
   driver.findElement(By.id("pass")).sendKeys(retrieveData.get("password"));
   driver.findElement(By.id("u_0_2")).click();
   


	}

}
