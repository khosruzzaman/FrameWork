package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class HomePage extends TestBase{
	
	// PAGE FACTORY -  OBJECT'S REPOSITORY
	@FindBy(xpath = "//button[@id='dLabellogin']")
	WebElement login_source_button;
	
	@FindBy(linkText = "About Us")
	WebElement about_Us;
	
	@FindBy(linkText = "Contact Us")
	WebElement contact_Us;
	
	@FindBy(linkText = "View Cart")
	WebElement verw_Cart;
	
	@FindBy(xpath = "//select[@name='currency_type']")
	WebElement currency_List;
	
	//Page Factory initialization 
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public boolean validateLoginSourceButton() {
		System.out.println("Name of this Button is : "+login_source_button.getText());
		return login_source_button.isDisplayed();
	}
}
