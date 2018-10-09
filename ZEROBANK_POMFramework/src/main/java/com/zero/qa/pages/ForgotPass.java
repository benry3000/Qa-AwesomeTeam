package com.zero.qa.pages;

import com.zero.qa.base.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPass extends TestBase
{
	// This is the email textbox on the forgot password page
	@FindBy(name ="email")
	WebElement EmailField;
	// This is the send password button on the forgot password page
	@FindBy(name ="sumbit")
	WebElement SendPasswordBtn;
	
	public ForgotPass() { 
		PageFactory.initElements(driver, this);
	}
	
	public String validateForgotPassTitle() { //get title of page
		return driver.getTitle();
	}
}
