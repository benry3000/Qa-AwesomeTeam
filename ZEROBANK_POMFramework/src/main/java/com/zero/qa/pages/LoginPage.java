package com.zero.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.zero.qa.pages.HomePage;
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
	
	@FindBy(partialLinkText = "Forgot your password ?")
	WebElement forgotPass;
	
	//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateZEROLogo(){
			return logo.isDisplayed();
		}
		
		public Home login(String un, String pwd){
			userLogin.sendKeys(un);
			userPassword.sendKeys(pwd);
			//loginBtn.click();
			    	JavascriptExecutor js = (JavascriptExecutor)driver;
			    	js.executeScript("arguments[0].click();", signInBtn);
			    	
			return new Home();
		}
		
		public boolean validateCheckBox() {
			return rememberMeCheckBox.isSelected();
		}
		
		public void clickOnCheckBox(){
			rememberMeCheckBox.click();
		}
		public void clickOnForgotPass(){
			forgotPass.click();
		}

		

}