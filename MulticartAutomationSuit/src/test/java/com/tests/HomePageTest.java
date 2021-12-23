package com.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestBase.TestBase;
import com.pages.HomePage;

public class HomePageTest extends TestBase{
	
	HomePage homePage;
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		
	}
	
	@Test
	public void HomePageTitle() {
		String pageTitle = homePage.validatePageTitle();
		Assert.assertEquals(pageTitle, "Multi lingual Cart", "This title is not Available");
		System.out.println("Assertion Passed!!!");
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		//driver.close();
		driver.quit();
		
		
	}

}
