package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.orangehrm.common.WebDriverFactory;

public class HomePage 

{
	
@FindBy(xpath= "//input[@id= 'welcome']")
 WebElement welcometxt;

@FindBy(id = "menu_admin_viewAdminModule")
WebElement adminbtn;



public HomePage()

{
	
	PageFactory.initElements(WebDriverFactory.getWebDriver(), this);
	
}

   public HomePage verifyWelcome (String welcometext)

   {
	Assert.assertEquals(welcometxt.getText(), welcometext);
	
	System.out.println("Welcometext seen");	
	
	return this;
   }

   public AdminPage clickonAdminbtn ()

   {
	adminbtn.click();	
	return new AdminPage();
	
   }


}
