package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import sun.net.www.protocol.http.HttpURLConnection;

public class BroLinks {

	public static void main(String[] args) throws MalformedURLException {
		
		//for_brokenlinks();
		for_broken();
	String url="";
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("kvani.roopa@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("roopasiva@123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		try {
		List<WebElement> linkslist=driver.findElements(By.tagName("a"));
		System.out.println(linkslist.size());
	    linkslist.addAll(driver.findElements(By.tagName("img")));
		System.out.println(linkslist.size());
		Iterator<WebElement> links=linkslist.iterator();
		while(links.hasNext()) {
			url=links.next().getAttribute("href");
			HttpURLConnection connection=(HttpURLConnection)new URL(url).openConnection();
			//HttpURLConnection huc=(HttpURLConnection)new URL(url).openConnection(); 
			//http
			connection.setRequestMethod("HEAD");
			connection.connect();
				int respcode=connection.getResponseCode();
				if(respcode>400) {
				System.out.println(url+"url is broken");	
				}
		}
		}catch(MalformedURLException mue) {
			
		}catch (IOException e) {
				//e.printStackTrace();
			}
		
		}
	public static void for_brokenlinks() {
		String url="";
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("kvani.roopa@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("roopasiva@123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		try {
		List<WebElement> linkslist=driver.findElements(By.tagName("a"));
		System.out.println(linkslist.size());
	    linkslist.addAll(driver.findElements(By.tagName("img")));
		System.out.println(linkslist.size());
		Iterator<WebElement> link=linkslist.iterator();
		while(link.hasNext()) {
	url=link.next().getAttribute("href");
		 
//		for(WebElement links:linkslist)
//		{
//		  String s=links.getAttribute("href");
	HttpURLConnection connection=(HttpURLConnection)new URL(url).openConnection();
			//HttpURLConnection huc=(HttpURLConnection)new URL(url).openConnection(); 
			//http
			connection.setRequestMethod("HEAD");
			connection.connect();
				int respcode=connection.getResponseCode();
				if(respcode>400) {
				System.out.println(url+"url is broken");	
				}
		}
		}catch(MalformedURLException mue) {
			
		}catch (IOException e) {
	}
	}
	
	public static void for_broken() {
		String url="";
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("kvani.roopa@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("roopasiva@123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		try {
		List<WebElement> linkslist=driver.findElements(By.tagName("a"));
		System.out.println(linkslist.size());
	    linkslist.addAll(driver.findElements(By.tagName("img")));
		System.out.println(linkslist.size());
		for(int i=0;i<linkslist.size();i++)
		{
		  url=linkslist.get(i).getAttribute("href");
	HttpURLConnection connection=(HttpURLConnection)new URL(url).openConnection();
			//HttpURLConnection huc=(HttpURLConnection)new URL(url).openConnection(); 
			//http
			connection.setRequestMethod("HEAD");
			connection.connect();
				int respcode=connection.getResponseCode();
				if(respcode>400) {
				System.out.println(url+"url is broken");	
				}
		}
		}catch(MalformedURLException mue) {
			
		}catch (IOException e) {
	}
	}

}