package com.utill;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.TestBase.TestBase;

public class Utility extends TestBase{
	public static long PAGE_LOAD_TIME_OUT = 3;
	public static long IMPLECITELY_WAIT_TIME = 3;
	
public static WebElement selectClass(WebElement value) {
	Select select = new Select(value);
	return value;
	
}
}
