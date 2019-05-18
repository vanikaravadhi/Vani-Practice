package DataProvider;

import org.testng.annotations.DataProvider;

import com.sun.org.apache.bcel.internal.classfile.Method;

public class SDProvider {
	
	//providing different values to different test cases in single data provider
	@DataProvider(name="SamepleDataProvider")
	public static Object[][] xyz(Method m)
	{
		Object data[][]=null;
		
		if(m.getName().equals("testA"))
		{
			data=new Object[2][3];
			data[0][0]="usr1";
			data[0][1]="pwd1";
			data[0][2]="xyz@gmail.com";
			
			
			data[1][0]="usr2";
			data[1][1]="pwd2";
			data[1][2]="abc@gmail.com";
			
			
			
		}
		else
			if(m.getName().equals("testB"))
			{
				data=new Object[2][2];
				data[0][0]="usr3";
				data[0][1]="pwd3";
				
				
				data[1][0]="usr3";
				data[1][1]="pwd3";
				
				
				
			}
		
		return data;
	}

}
