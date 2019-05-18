package DataProvider;

import org.testng.annotations.Test;

public class TestCases {
	
	
	@Test(priority=1,dataProviderClass=SDProvider.class,dataProvider="SamepleDataProvider")
	public void testA(String usr,String pwd,String email)
	{
		System.out.println(usr+"......."+pwd+".........."+email);
	}
	
	@Test(priority=2,dataProviderClass=SDProvider.class,dataProvider="SamepleDataProvider")
	
	public void testB(String usr,String pwd)
	{
		System.out.println(usr+"......."+pwd);
	}
	}


