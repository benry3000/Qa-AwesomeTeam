package com.zero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zero.qa.base.*;

public class HelpPage extends TestBase 
{
	//(How do I log into my account?) Link
	@FindBy(xpath = "//a[containstext(),'log into']")
	WebElement LogIntoLink;
	
	//(How do I transfer funds?) Link
	@FindBy(xpath = "//a[containstext(),'transfer funds?']")
	WebElement TransferFundsLink;
	
	//(How do I pay bills?) Link
	@FindBy(xpath = "//a[containstext(),'pay bills?']")
	WebElement PayBillsLink;
	
	public HelpPage() { 
		PageFactory.initElements(driver, this);
	}
	
	public String validateHelpPageTitle() { //get title of page
		return driver.getTitle();
	}
}
