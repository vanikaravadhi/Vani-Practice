import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverLaunch {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the browser name :");
		
		String browser=s.nextLine();
		s.close();
		
		
		switch(browser.toLowerCase())
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "IE":
			System.setProperty("webdriver.chrome.driver", "src/IEDriverServer.exe");
			break;
		case "opera":
			
			System.setProperty("webdriver.chrome.driver", "src/operadriver.exe");
			break;
			
			default:
				System.out.println("invalid browser name given, browser name must be in the list(chrome,IE,opera)");
				System.exit(0);
				
				
			
		}

	}

}
