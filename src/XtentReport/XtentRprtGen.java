package XtentReport;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class XtentRprtGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver driver=new ChromeDriver();
//		driver.get("https://crmpro.com");
//		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		   driver.findElement(By.name("username")).sendKeys("anilsatharla");
//		   driver.findElement(By.name("password")).sendKeys("anil1234");
//		   driver.findElement(By.xpath("//input[@value='Login']")).submit();
		   File fi=new File(System.getProperty("usr.dir")+"/"+"Extent Reports");
		   if(!fi.exists())
			   fi.mkdir();
//		   ExtentTest logger;
//		   ExtentReports extentReporter;
//		   ExtentHtmlReporter
//		   
		   
		   
		  

	}

}
