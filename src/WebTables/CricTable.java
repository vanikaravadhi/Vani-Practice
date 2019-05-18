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

public class CricTable {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//datafromTable();
		WebDataIntoExcel();

	}
	
	public static void datafromTable()
	{
     driver=new ChromeDriver();
     driver.get("https://www.cricbuzz.com/");
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     driver.findElement(By.id("search_bar")).sendKeys("Virat Kohli",Keys.ENTER);
     driver.findElement(By.xpath("//span[text()='Virat Kohli']")).click();
     WebElement batting_table=driver.findElement(By.xpath("//div[text()='Batting Career Summary']/following-sibling::table"));
     List<WebElement> allRows=batting_table.findElements(By.tagName("tr"));
     List<WebElement> headerRow=allRows.get(0).findElements(By.tagName("th"));
     System.out.println(headerRow.size());
     for(int head=0;head<headerRow.size();head++)
     {
    	 String headerNames=headerRow.get(head).getText();
    	 System.out.print(headerNames+" ");
     }
     System.out.println();
     for(int rows=1;rows<allRows.size();rows++)
     {
    	 List<WebElement> row=allRows.get(rows).findElements(By.tagName("td"));
    	 for(int col=0;col<row.size();col++)
    	 {
    		 String colData=row.get(col).getText();
    		 System.out.print(colData+" ");
    	 }
    	 System.out.println();
    	    
    	 }
     		 
	}
	
	public static void WebDataIntoExcel()
	{
		driver=new ChromeDriver();
	     driver.get("https://www.cricbuzz.com/");
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     try{
	    	 driver.findElement(By.id("search_bar")).sendKeys("Virat Kohli",Keys.ENTER);
	     
	     driver.findElement(By.xpath("//span[text()='Virat Kohli']")).click();
	     WebElement batting_table=driver.findElement(By.xpath("//div[text()='Batting Career Summary']/following-sibling::table"));
	     List<WebElement> allRows=batting_table.findElements(By.tagName("tr"));
	     List<WebElement> headerRow=allRows.get(0).findElements(By.tagName("th"));
	     XSSFWorkbook wb=new XSSFWorkbook();
	     XSSFSheet sheet=wb.createSheet("Virat_batting");
	     XSSFRow row=sheet.createRow(0);
	     XSSFCell cell;
	     for(int head=0;head<headerRow.size();head++)
	     {
	    	 String headerName=headerRow.get(head).getText();
	    	 cell=row.createCell(head);
	    	 cell.setCellValue(headerName); 	 
	     }
	     for(int rows=1;rows<allRows.size();rows++) {
	    	 List<WebElement> rowdata=allRows.get(rows).findElements(By.tagName("td"));
	    	 row=sheet.createRow(rows);
	    	 for(int col=0;col<rowdata.size();col++)
	    	 {
	    		 String colData=rowdata.get(col).getText();
	    		 cell=row.createCell(col);
	    		 cell.setCellValue(colData);
	    	 }
	     }
	     FileOutputStream fos=new FileOutputStream("Virat_batting.xlsx");
	     wb.write(fos);
	     
	     }
	     catch(Exception e)
	     {
	     }
	     }
	     
	}

