package DataFromExcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatafromExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String allData="";
		try {
			
			FileInputStream fin=new FileInputStream("test1.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(fin);
			XSSFSheet sh=wb.getSheet("Sheet1");
			int rowCount=sh.getLastRowNum();
			System.out.println("number of rows"+rowCount);
			
			for(int i=0;i<rowCount;i++)
			{
				int cellCount=sh.getRow(i).getLastCellNum();
				
				
				for(int j=0;j<cellCount;j++)
				{
					XSSFCell ocell=sh.getRow(i).getCell(j);
					CellType type=ocell.getCellType();
					switch(type)
					{
					case STRING :
						allData=ocell.getStringCellValue();
						break;
					case NUMERIC :
						allData=String.valueOf((int)ocell.getNumericCellValue());
						break;
					case FORMULA :
						allData=ocell.getRawValue();
						break;
						default :
							System.out.println("invalid cell type given");					
					}
					
					System.out.print(allData+" ");
				}
				System.out.println();
			
		      }				
		      }
		catch(Exception e)
		{
			e.printStackTrace();
		}

		}


	}


