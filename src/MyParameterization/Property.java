package MyParameterization;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property {
	
	static WebDriver driver;

	public static HashMap<String, String> getProperty()
	{
		String file="C:\\Users\\vani123\\Practice\\Selenium\\ConfigProperties\\OrangeHRM.properties";
		
		HashMap<String,String> hm=new HashMap<String,String>();
		try{
			FileInputStream fin=new FileInputStream(file);
			Properties p=new Properties();
			p.load(fin);
			
			Set<Object> allKeys=p.keySet();
		//	System.out.println(allKeys);
			
			//ArrayList<> allValues=p.values();
			
			for(Object keys:allKeys)
			{
				String values=p.getProperty(keys.toString());
				
			//	System.out.println(values);
				hm.put(keys.toString(), values);
				
			//	System.out.println(hm);
			}
			
					
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return hm;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}
	public static HashMap<String, String> getProp()
	{
		
	HashMap<String,String> prop=getProperty();
		System.out.println(prop);
		
	String brow=prop.get("browser");
	switch(brow.toLowerCase())
	{
	 case "chrome" :
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vani123\\Practice\\Drivers\\chromedriver.exe");
	 driver =new ChromeDriver();
	 break;
	 
	 case "IE" :
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vani123\\Practice\\Drivers\\chromedriver.exe");
		 driver =new ChromeDriver();
		 break;
		 
		 default :
			 
			 System.out.println("browser name is invalid");
	
	}

	driver.get(prop.get("url"));
	driver.findElement(By.id("txtUsername")).sendKeys(prop.get("username"));
	driver.findElement(By.id("txtPassword")).sendKeys(prop.get("password"));
	driver.findElement(By.id("btnLogin")).submit();
	return prop;
	
	}

}
