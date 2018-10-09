package com.zero.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zero.qa.base.TestBase;

//Login Page
public class LoginPage extends TestBase {
	
	//logo
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/a")
	WebElement logo;
	
	//userLogin
	@FindBy(name = "user_login")
	WebElement userLogin;
	
	//userPassword
	@FindBy(name = "user_password")
	WebElement userPassword;
	
	//UserRememberMe
	@FindBy(name = "user_remember_me")
	WebElement rememberMeCheckBox;
	
	//SignInBtn
	@FindBy(xpath = "//input[@type='submit' and @value='Sign in']")
	WebElement signInBtn;
	
	public LoginPage() { 
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() { //get title of page
		return driver.getTitle();
	}

}