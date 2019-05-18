package DataProvider;

import org.testng.annotations.Test;

public class Sample {
	
	@Test(priority=1,dataProviderClass=Provider.class,dataProvider="prove")
	
	public void stest(String usr,String pwd,String email)
	{
		System.out.println(usr+"......."+pwd+".........."+email);
	}
	
	@Test(priority=2,dataProviderClass=Provider.class,dataProvider="prove1")

	public void test2(String usr,String pwd)
	{
		System.out.println(usr+"......."+pwd);
	}
	

}
