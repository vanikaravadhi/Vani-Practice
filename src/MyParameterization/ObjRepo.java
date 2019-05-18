package MyParameterization;

import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ObjRepo {
	
	
	
	public static Document loadRepo()
	{
		Document d=null;
		
		String file="C:\\Users\\vani123\\Practice\\Selenium\\ObjectRepo\\OrangeHRM.xml";
		
		try {
			FileInputStream fin=new FileInputStream(file);
			
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db=dbf.newDocumentBuilder();
		d=db.parse(fin);
					
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return d;
		
	}
	
	public static String[] getObjIden(String tagName)
	{
		String[] s=new String[2];
		Document ele=loadRepo();
		
		NodeList nl=ele.getElementsByTagName(tagName);
		
		int len=nl.getLength();
		
		if(len>1)
		{
			System.out.println("duplicate tagname found :"+tagName);
			System.exit(0);
		}
		else
			if(len==0)
			{
				System.out.println("tag name is not found in the repository :"+tagName);
				System.exit(0);
			}
			else
				
			{
				Element e=(Element)nl.item(0);
				if(e.hasAttribute("locator"))
				{
					s[0]=e.getAttribute("locator");
				}
				else
				{
					System.out.println("attributes are not available for the given tagname :"+tagName);
					System.exit(0);
				}
				
				if(e.hasAttribute("value"))
				{
					s[1]=e.getAttribute("value");
				}
				else
				{
					System.out.println("attributes are not available for the given tagname :"+tagName);
					System.exit(0);
			
			}
			}
				
				return s;
			
		
	}
	
	public static By getObject(String tagName)
	{
		By by=null;
		String[] val=getObjIden(tagName);
		
		switch(val[0].toLowerCase())

	{
		case "id" :
			by=By.id(val[1]);
			
		case "name" :
			by=By.name(val[1]);
			
		case "classname" :
			by=By.className(val[1]);
			
		case "tagname" :
			by=By.tagName(val[1]);
			
		case "linktext" :
			by=By.linkText(val[1]);
			
		case "partiallinktext" :
			by=By.partialLinkText(val[1]);
		
		case "xpath" :
			by=By.partialLinkText(val[1]);
			
		case "CSS" :
			by=By.cssSelector(val[1]);
			
			default :
				System.out.println("invalid locators entered");
			
		}
		
		return by;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vani123\\Practice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(Property.getProperty().get("url"));
		driver.findElement(By.id("txtUsername")).sendKeys(Property.getProperty().get("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(Property.getProperty().get("password"));
		
		driver.findElement(getObject("login")).click();
		driver.findElement(getObject("admin")).click();
		driver.findElement(getObject("username")).sendKeys(Property.getProperty().get("username1"));
		driver.findElement(getObject("employeename")).sendKeys(Property.getProperty().get("employeename"));

	}

}
