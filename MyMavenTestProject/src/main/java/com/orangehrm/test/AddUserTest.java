package com.orangehrm.test;
import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.pages.LoginPage;

public class AddUserTest extends BaseSelenium {
	
	@Test
	public void verifyAdminUserGettingAddedSuccessfuly()
	{
		
		LoginPage lp = new LoginPage();
		
		lp.login("swati", "Test_123")
			.verifyWelcome("Welcome Admin")
				.clickonAdminbtn()
					.clickonAddbtn()
						.addUser("Admin", "Swati", "User123","Password_123","Password_123");
	}
	
	

	@Test
	public static void AddUserWithAdminRole()
	
	{
		LoginPage lp = new LoginPage();
		
		lp.login("swati", "Test_123")
		  .verifyWelcome("Welcome Admin")
		    .clickonAdminbtn()
		     .clickonAddbtn()
		      .addUser("Admin", "ABC", "ABC_123", "Test_123", "Test_123");
		
	}
	
	@Test
	public static void AddUserWithESSRole()
	
	{
        LoginPage lp = new LoginPage();
		
		lp.login("swati", "Test_123")
		  .verifyWelcome("Welcome Admin")
		    .clickonAdminbtn()
		     .clickonAddbtn()
		      .addUser("ESS", "XYZ", "XYZ_123", "Test_123", "Test_123");
		
	}
	
}
