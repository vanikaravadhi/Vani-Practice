package MyParameterization;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBPro {

	static WebDriver driver;
	public static HashMap<String, String> getProp(){
		HashMap<String, String> data=new HashMap<String, String>();
		
	try {
		FileInputStream fin=new FileInputStream("test.properties");
	Properties p=new Properties();
	p.load(fin);
	Set<Object> s=p.keySet();
//	Iterator<Object> itr=s.iterator();
//	String s1=itr.next().toString();
//	
	for(Object values:s)
	{
		String value=values.toString();
	}
	}
	catch(Exception e)
	{
		
	}
	return data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProp();
		

	

}
	}
