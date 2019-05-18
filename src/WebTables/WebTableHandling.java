package WebTables;

import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dataFromWebTable();
		WebTabDataIntoExcel();

	}
	
	public static void dataFromWebTable()
	{
		driver= new ChromeDriver();
		   driver.get("https://cricbuzz.com");
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.id("search_bar")).sendKeys("dhoni",Keys.ENTER);
		 driver.findElement(By.xpath("//span[text()='MS Dhoni']")).click();
		 WebElement bowling_table=driver.findElement(By.xpath("//div[text()='Bowling Career Summary']//following-sibling::table"));
		 List<WebElement> allRows=bowling_table.findElements(By.tagName("tr"));
		 System.out.println(allRows.size());
		 List<WebElement> headerRow=allRows.get(0).findElements(By.tagName("th"));
		 System.out.println(headerRow.size());
		 
		 for(int headName=0;headName<headerRow.size();headName++)
		 {
			 String headerName=headerRow.get(headName).getText();
			 System.out.print(headerName+"  ");
		 }
		 System.out.println();
		 
		for(int row=1;row<allRows.size();row++)
		 {
			 List<WebElement> allColumns=allRows.get(row).findElements(By.tagName("td"));
			for(int col=0;col<allColumns.size();col++)
			{
				String names=allColumns.get(col).getText();
				 System.out.print(names+"  ");
			}
			 System.out.println();
		}
        }
	
	public static void WebTabDataIntoExcel()
	{
		String file="C:\\Users\\vani123\\Practice\\Selenium\\Dhoni_bowling.xlsx";
		driver= new ChromeDriver();
		   driver.get("https://cricbuzz.com");
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.id("search_bar")).sendKeys("dhoni",Keys.ENTER);
		 driver.findElement(By.xpath("//span[text()='MS Dhoni']")).click();
		 
		 try{
			 XSSFWorkbook wb=new XSSFWorkbook();
		 
		 WebElement bowling_table=driver.findElement(By.xpath("//div[text()='Bowling Career Summary']//following-sibling::table"));
		 List<WebElement> allRows=bowling_table.findElements(By.tagName("tr"));
		 List<WebElement> headerRow=allRows.get(0).findElements(By.tagName("th"));
		 
		 XSSFSheet sheet=wb.createSheet("Bowling_data");
		 XSSFRow rows=sheet.createRow(0);
		 XSSFCell cell;
		 
		 for(int head=0;head<headerRow.size();head++) {
			 
			 String headers=headerRow.get(head).getText();
			 
			 cell=rows.createCell(head);
			 cell.setCellValue(headers);			 
    	 }
		 for(int row=1;row<allRows.size();row++) {
			 List<WebElement> r=allRows.get(row).findElements(By.tagName("td"));
			 rows=sheet.createRow(row);
			 
			 for(int col=0;col<r.size();col++)
			 {
			 String data=r.get(col).getText();
			 cell=rows.createCell(col);
			 cell.setCellValue(data);
		 }
		 }
		 FileOutputStream fos=new FileOutputStream(file);
		 wb.write(fos);
		 
		 }
		 catch(Exception e)
		 {
			 
		 }
	}
}

