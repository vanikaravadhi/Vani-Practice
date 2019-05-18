//package vanisel;
//
//import java.util.List;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class TimeandDateCSS {
//
//	static WebDriver driver;
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		
//		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//		 driver=new ChromeDriver();
//		driver.get("https://timeanddate.com");
//		driver.findElement(By.xpath("//a[text()='World Clock']"));
//		
//		Actions act=new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//a[text()='World Clock']"))).build().perform();
//		driver.findElement(By.xpath("//a[text()='Main World Clock']")).click();
//        Thread.sleep(3000);
//		String part1="//table[@class='zebra fw tb-theme']/tbody/tr[";
//		String part2="]/td[3]";
//		
//		String name="Dublin";
//		String time="Sat 04:15";
//	
//		int i=1;
//		while(isElementPresent(part1+i+part2))
//		{
//			String third=driver.findElement(By.xpath(part1+i+part2)).getText();
//			
//			if(third.equals(name))
//			{
//				String n=part1+i+part2.replace("td[3]", "td[4]");
//				String fourth=driver.findElement(By.xpath(n)).getText();
//				//System.out.println(third+"----------------"+fourth);
//				if(fourth.equals(time))
//				{
//					System.out.println(third+"----------------"+fourth);
//					//recordFound=true;
//					break;
//				}
//			}		
//		}
//		//Assert.assertTrue(recordFound,"records not found");
//	}
//	public static boolean isElementPresent(String elexpath)
//	{
//		int size=driver.findElements(By.xpath(elexpath)).size();
//		if(size==0)
//			return false;
//		else 
//			return true;
//	}
//}
