package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.orangehrm.common.WebDriverFactory;

public class LoginPage {
	
	
	@FindBy(xpath ="//input[@name='txtUsername']")
	WebElement username;		
	
	@FindBy(xpath = "//input[@name = 'txtPassword']")
	WebElement password;
	
	@FindBy(xpath = "//input[@name = 'Submit']")
	WebElement submitbtn;
	
	@FindBy(xpath = "//input[@id = 'spanMessage']")
	WebElement spanmsg;


	public LoginPage()
	{
		PageFactory.initElements(WebDriverFactory.getWebDriver(), this);
		
		
	}
	
	public HomePage login (String strUsername, String strPassword)
	
	{
		username.sendKeys(strUsername);
		password.sendKeys(strPassword);
		submitbtn.click();
		return new HomePage();
	}
	
	
	
	public LoginPage loginForInvalidCredentials (String strUsername, String strPassword)
	
	{
		username.sendKeys(strUsername);
		password.sendKeys(strPassword);
		submitbtn.click();
		return this;
	}
	public LoginPage verifyErrorMsg (String spanMsgText)
	
	{
		Assert.assertEquals(spanmsg.getText(),spanMsgText ,"Invalid Log in spam message seen");
		return this; //log in page object
	}
	
	
	
}
