package WebTables;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

public class cricbuzz_handlingtable {

	public static void main(String[] args) throws InterruptedException {
		data_into_excel();
	}
		public static void handling_webtable() {
   WebDriver driver= new ChromeDriver();
   driver.get("https://cricbuzz.com");
   driver.findElement(By.id("search_bar")).sendKeys("dhoni",Keys.ENTER);
   driver.findElement(By.partialLinkText("MS Dhoni")).click();
   WebElement batting_table=driver.findElement(By.xpath("//div[text()='Batting Career Summary']/following-sibling::table"));
   List<WebElement> allrows=batting_table.findElements(By.tagName("tr"));
   List<WebElement>  head=allrows.get(0).findElements(By.tagName("th"));
   //getting headerrow
   for(int headnum=0;headnum<head.size();headnum++) {
	  String head_text=head.get(headnum).getText();
	  System.out.print(head_text+"  ");
   }
   System.out.println();
   
   //getting how many coloumns in each row
	for(int rownum=1;rownum<allrows.size();rownum++) {
		List<WebElement>  allcols=allrows.get(rownum).findElements(By.tagName("td"));
		for(int colnum=0;colnum<allcols.size();colnum++) {
			String coltext=allcols.get(colnum).getText();
			System.out.print(coltext+"   ");
		}
	System.out.println();
	}
}
	

	public static void data_into_excel(){
		try {
		String filename="C:\\Users\\vani123\\Practice\\Selenium\\Dhonidata.xlsx";
		 WebDriver driver= new ChromeDriver();
		   driver.get("https://cricbuzz.com");
		   driver.findElement(By.id("search_bar")).sendKeys("dhoni",Keys.ENTER);
		   driver.findElement(By.partialLinkText("MS Dhoni")).click();
		   XSSFWorkbook wb=new XSSFWorkbook();
		   WebElement batting_table=driver.findElement(By.xpath("//div[text()='Batting Career Summary']/following-sibling::table"));
		   List<WebElement> allrows=batting_table.findElements(By.tagName("tr"));
		   List<WebElement>  head=allrows.get(0).findElements(By.tagName("th"));
		   XSSFSheet sheet=wb.createSheet("dhoni_batting");
		   XSSFRow row=sheet.createRow(0);
		   XSSFCell cell;
		   for(int headnum=0;headnum<head.size();headnum++) {
				  String head_text=head.get(headnum).getText();
				   cell=row.createCell(headnum);
				 cell.setCellValue(head_text);
			   }
		   for(int rownum=1;rownum<allrows.size();rownum++) {
				List<WebElement>  allcols=allrows.get(rownum).findElements(By.tagName("td"));
				row=sheet.createRow(rownum);
				for(int colnum=0;colnum<allcols.size();colnum++) {
					String coltext=allcols.get(colnum).getText();
					cell=row.createCell(colnum);
					cell.setCellValue(coltext);
				}
				
				
		   }
		   FileOutputStream	fos = new FileOutputStream(filename);
			 wb.write(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}

