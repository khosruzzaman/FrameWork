package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory / Object Repository
	@FindBy(xpath = "//*[@id='dLabellogin']/span")
	WebElement login_Source_Button;
	
	@FindBy(xpath = "//*[@id='username']")
	WebElement user_Name;
	
	@FindBy(xpath = "//*[@id='passowrd']")
	WebElement pass_word;
	
	@FindBy(xpath = "//*[@id='jqLogin']")
	WebElement login_Button;
	
	@FindBy(xpath = "//*[@id='dLabel']/span")
	WebElement current_User_name;
	
	// Initialized the page factory
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		String pageTitle = driver.getTitle();
		System.out.println("The Login Page Title is : "+ pageTitle); //WildFire Cart
		return pageTitle;
	}
	public void loginSourceClick() {
		login_Source_Button.click();
	}
	
	public HomePage validateLogin(String userName, String passWord) throws InterruptedException {
		user_Name.sendKeys(userName);
		pass_word.sendKeys(passWord);
		login_Button.click();
		return new HomePage();
	}
	
	public String validateCurrentUserName() {
		String currentUser = current_User_name.getText();
		System.out.println("Logged User Name is :"+currentUser);
		return currentUser;
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
	
	
	
	

}
