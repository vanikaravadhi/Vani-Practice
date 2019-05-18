package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	
	int count=0;
	int retryLimit=4;
	
	public boolean retry(ITestResult result)
	{
		
		if(count<=retryLimit)
		{
			
			count++;
			return true;
			
		}
		
		else 
			
			return false;
	}

}
