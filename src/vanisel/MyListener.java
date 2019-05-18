package vanisel;

import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class MyListener extends AbstractWebDriverEventListener{

	public void afterNavigateBack()
	{
		System.out.println("hello");
	}
	
}
