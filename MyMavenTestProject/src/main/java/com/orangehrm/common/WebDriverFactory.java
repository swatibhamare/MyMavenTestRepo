package com.orangehrm.common;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory 

{
	
	private static ThreadLocal <WebDriver> threadLevelStorage=new ThreadLocal<WebDriver>();
	
	
    protected static void setWebDriver(WebDriver dr) {
		
		threadLevelStorage.set(dr);
	}


	public static WebDriver getWebDriver(){
		
		return threadLevelStorage.get();
	}
	

}
