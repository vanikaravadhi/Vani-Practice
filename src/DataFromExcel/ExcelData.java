package DataFromExcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fin=new FileInputStream("Dhoni_bowling.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		XSSFSheet sheet=wb.getSheetAt(0);
		int row_count=sheet.getLastRowNum();
		for(int i=0;i<row_count;i++)
		{
		  int col_count=sheet.getRow(i).getLastCellNum();
		  for(int col=0;col<col_count;col++)
		  {
		  XSSFCell cell=sheet.getRow(col).getCell(col);
		  CellType ocell=cell.getCellType();
		  switch(ocell)
		  {
		  
		  }
		}
		}

	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}
