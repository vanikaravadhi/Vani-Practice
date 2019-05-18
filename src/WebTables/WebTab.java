package WebTables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//read_webTable();
		webDataInto_Excel();
		
		}
	public static void read_webTable()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='search_bar']")).sendKeys("dhoni",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='MS Dhoni']")).click();
		WebElement batting_table=driver.findElement(By.xpath("//div[text()='Batting Career Summary']//following-sibling::table"));
		List<WebElement> table_rows=batting_table.findElements(By.tagName("tr"));
		System.out.println(table_rows.size());
		List<WebElement> table_head=batting_table.findElements(By.tagName("th"));
		System.out.println(table_head.size());
		for(int i=0;i<table_head.size();i++)
		{
			String s=table_head.get(i).getText();
			System.out.print(s+"  ");
		}
		System.out.println();
		for(int row=1;row<table_rows.size();row++)
		{
			List<WebElement> rows=table_rows.get(row).findElements(By.tagName("td"));
			for(int col=0;col<table_head.size();col++) {
				String data=rows.get(col).getText();
		          System.out.print(data+"  ");
			}
			System.out.println();

          }
		
}
	public static void webDataInto_Excel()
	{
		try{
			
			WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='search_bar']")).sendKeys("dhoni",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='MS Dhoni']")).click();
		WebElement batting_table=driver.findElement(By.xpath("//div[text()='Batting Career Summary']//following-sibling::table"));
		List<WebElement> table_rows=batting_table.findElements(By.tagName("tr"));
		FileOutputStream fos=new FileOutputStream("data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("Dhoni_batting");
		XSSFRow row=sheet.createRow(0);
		List<WebElement> table_head=batting_table.findElements(By.tagName("th"));
		for(int i=0;i<table_head.size();i++)
		{
			String s=table_head.get(i).getText();
			row.createCell(i);
			
		}
	    wb.write(fos);
		
		}
		catch(Exception e)
		{
		e.printStackTrace();
	}

	}
}
