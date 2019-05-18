package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameters {
	
  @Test(dataProvider="registerData")
  public void f(String username,String pwd,String Email,String city) {
	  
	  System.out.println(username+"..."+pwd+"....."+Email+"...."+city);
	  
	  try{
		  Assert.assertEquals("good", "goodxy");
	  }
	  catch(Exception e)
	  {
		  System.out.println("handling exception");
	  }
	  
	  System.out.println("testing");
	  
	  //Assert.assertTrue(6>2, "error message");
	  //Assert.assertTrue(6<2, "error message");
	  
	  //Assert.assertFalse(6<2, "error message");
	  //Assert.assertFalse(6>2, "error message");
	  
  }
  
  @Test
  public void n()
  {
	  System.out.println("after first test");
  }
  
  @DataProvider
  
  public Object[][] registerData()
  {
	  Object[][] data=new Object[3][4];
	  data[0][0]="user1";
	  data[0][1]="pwd1";
	  data[0][2]="Email";
	  data[0][3]="city1";
	  
	  
	  data[1][0]="user2";
	  data[1][1]="pwd2";
	  data[1][2]="email2";
	  data[1][3]="city2";
	  
	  data[2][0]="user3";
	  data[2][1]="pwd3";
	  data[2][2]="email3";
	  data[2][3]="city3";
	  
	  return data;
  }
}
