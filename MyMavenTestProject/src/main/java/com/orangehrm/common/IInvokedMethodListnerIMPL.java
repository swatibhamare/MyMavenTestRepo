package com.orangehrm.common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedMethodListnerIMPL implements IInvokedMethodListener{
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1)
	{
	
		WebDriverFactory.getWebDriver().quit();
	}

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) 
	{
		
		System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver.exe");
		
		WebDriverFactory.setWebDriver(new ChromeDriver());
		
		WebDriverFactory.getWebDriver().get("http://127.0.0.1/orangehrm-3.3.1/");	
	
	}
}
