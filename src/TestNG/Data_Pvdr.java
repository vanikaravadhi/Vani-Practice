package TestNG;

import org.testng.annotations.DataProvider;

public class Data_Pvdr {
	
	@DataProvider(name="Data_Provider")
	
	public static Object[][] passData()
	{
		Object[][] data=new Object[2][3];
		
		data[0][0]="usr1";
		data[0][1]="pwd1";
		data[0][2]="xyz@gmail.com";
		
		
		data[1][0]="usr2";
		data[1][1]="pwd2";
		data[1][2]="abc@gmail.com";
		
		return data;
		
		
	}

}
