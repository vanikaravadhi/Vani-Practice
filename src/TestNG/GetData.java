package TestNG;

import org.testng.annotations.Test;

public class GetData {
	
	@Test(dataProviderClass=Data_Pvdr.class,dataProvider="Data_Provider")
	
	public void register(String username,String pwd,String gmail)
	{
		System.out.println(username+"...."+pwd+"..."+gmail);
	}
	

}
