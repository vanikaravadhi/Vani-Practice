package vanisel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirlinesDateSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String d="10-05/2019";
		SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
		
		//Date d1=df.parse(d);
		
		Calendar cal=Calendar.getInstance();
		//cal.setTime(d1);
		String[] mon= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		
		int day=cal.get(Calendar.DAY_OF_MONTH);
		String monthName=cal.getDisplayName(Calendar.MONTH, Calendar.LONG,Locale.US);
		int year=cal.get(Calendar.YEAR);
		
		System.out.println(day);
		System.out.println(monthName);
		System.out.println(year);
		//System.out.println(mon[monthName]);
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.americanairlines.in/i18n/moresearch.jsp?locale=en_IN");
		
		driver.findElement(By.xpath("//label[contains(text(),'Depart')]/descendant::button")).click();
		
		String nextArrow="//a[@class='ui-datepicker-next ui-corner-all']";
		
		String monthyear="//div[@class='ui-datepicker-title']";
		
		//String mnyr=monthName[mon]+year;
		
		
		

	}

}
