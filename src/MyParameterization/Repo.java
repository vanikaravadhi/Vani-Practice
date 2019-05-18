package MyParameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Repo {
	

	public static Document loadRepo()
	{
		Document d=null;
			String file="C:\\Users\\vani123\\Practice\\Selenium\\ConfigProperties\\OrangeHRM.properties";
			FileInputStream fin;
			try {
				fin = new FileInputStream(file);
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBuilder db=dbf.newDocumentBuilder();
			d=db.parse(fin);
			} catch (ParserConfigurationException | SAXException | IOException e) {
				e.printStackTrace();
			}
			
			return d;	

		}
		
		
	
		public static String[] getEleIdentification(String tagName) {
		
			String[] iden=new String[2];
			Document doc=Data.Objrep;
			
			NodeList nd=doc.getElementsByTagName(tagName);
			int ele=nd.getLength();
			if(ele>1) {
				System.out.println("duplicate elements are found :"+tagName);
				System.exit(0);
			}
			else if(ele==0) {
			
				System.out.println("element is not found :"+tagName);
				System.exit(0);
			}
			else {
			Element e=(Element)nd.item(0);
			if(e.hasAttribute("locator"))
			{
				iden[0]=e.getAttribute("locator"); 
			}
			else
			{
				System.out.println("locator is not found by given tagname"+tagName);
				System.exit(0);
			}
			
			if(e.hasAttribute("value"))
			{
				iden[1]=e.getAttribute("value");
			}
			else
			{
				System.out.println("value is not found");
				System.exit(0);
			}
			
			
						
		}
			return iden;
		}
		
		
		public static By getLocatorFromRep(String tagName){
		String[] prop=getEleIdentification(tagName);
			By by=null;
			switch (prop[0]) {
			case "id":
				by=By.id(prop[1]);
				break;
           case "name":
        	   by=By.name(prop[1]);
				break;
           case "classame":
        	   by=By.className(prop[1]);
	      break;
           case "tagname":
        	   by=By.tagName(prop[1]);
	      break;
           case "linktext":
        	   by=By.linkText(prop[1]);
	      break;
          case "partiallinktext":
        	  by=By.partialLinkText(prop[1]);
	       break;
         case "xpath":
        	 by=By.xpath(prop[1]);
	       break;
			default:
				by=By.cssSelector(prop[1]);
				break;
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
		
		driver.findElement(getLocatorFromRep("login")).click();
		//driver.findElement(getLocatorFromRep("admin")).click();
	//	driver.findElement(getLocatorFromRep("username")).sendKeys(Property.getProperty().get("username1"));
	//	driver.findElement(getLocatorFromRep("employeename")).sendKeys(Property.getProperty().get("employeename"));
		
		
		
	}

}
