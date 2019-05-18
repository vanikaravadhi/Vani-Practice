package Analyzer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldata {


	public static void main(String[] args) {
		String alldata="";
    try {
		FileInputStream fis=new FileInputStream("new.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();
		System.out.println("row count == "+rowCount);
	for(int i=1;i<rowCount;i++) {
		int cellCount=sheet.getRow(i).getLastCellNum();
//		System.out.println("column count in row "+i+"=="+cellCount);
		for(int j=0;j<cellCount;j++) {
			XSSFCell ocell=sheet.getRow(i).getCell(j);
			CellType type=ocell.getCellType();
			switch (type) {
			case STRING:
				alldata=ocell.getStringCellValue();
				break;
			case NUMERIC:
				alldata=String.valueOf ((int)ocell.getNumericCellValue());
				break;
			case FORMULA:
				
				break;
				
			default:
				break;
			}
			System.out.print(alldata+"  ");
		}
		System.out.println();
		
	}
		
	} catch ( IOException e) {
		e.printStackTrace();
	}
    
	}

}
