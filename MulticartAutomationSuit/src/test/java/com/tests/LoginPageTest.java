package com.tests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestBase.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		loginPage = new LoginPage();
		homePage  = new HomePage();
		initialization();
	}
	
	//@Test(priority = 2)
	public void validatLoginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "WildFire Cart", "Page title doesnt matched!!" );
	}
	//@Test(priority = 1)
	public void clickLoginSourceButtonTest() {
		loginPage.loginSourceClick();
	}
	@Test(priority = 2)
	public void loginTest() throws InterruptedException {
		loginPage.loginSourceClick();
		loginPage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority = 3)
	public void validateUserNameTest() {
		loginPage.validateCurrentUserName();
	}
	@AfterMethod
	public void tearDown() {
		loginPage.closeBrowser();
	}

}
