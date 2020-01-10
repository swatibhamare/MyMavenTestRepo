package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.common.WebDriverFactory;

public class AdminPage {
	
	@FindBy(id = "btnAdd") 
	WebElement addbtn;
	
	public AdminPage()
	
	{
		PageFactory.initElements(WebDriverFactory.getWebDriver(), this);
	}
	
	
	public AdminPage clickonAddbtn()
	{
		addbtn.click();
		return new AdminPage();
	}


	public void addUser(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
