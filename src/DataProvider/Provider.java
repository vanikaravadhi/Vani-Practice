package DataProvider;

import org.testng.annotations.DataProvider;

public class Provider {
	
	@DataProvider(name="prove")
	
	public Object[][] test()
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
	
	
	@DataProvider(name="prove1")
	
	public Object[][] test1()
	{
Object[][] data1=new Object[2][2];
		
		data1[0][0]="usr3";
		data1[0][1]="pwd3";
		
		
		data1[1][0]="usr3";
		data1[1][1]="pwd3";
		
		return data1;
		
	}
	

}
