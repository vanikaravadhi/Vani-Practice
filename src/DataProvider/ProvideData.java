package DataProvider;

import org.testng.annotations.DataProvider;

public class ProvideData {
	
	@DataProvider(name="providingdata")
	
	public Object[][] value()
	{
		Object[][] data=new Object[2][2];
		
		data[0][0]="kvani.roopa@gmail.com";
		
		data[0][1]="roopasiva@123";
		
		data[1][0]="kvani.roopa@gmail.com";
		data[1][1]="roopasiva@123";
		
		return data;
	}

}
