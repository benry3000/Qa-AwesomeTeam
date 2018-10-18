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
	@FindBy(partialLinkText= "How do I transfer funds?")
	WebElement TransferFundsLink;
	
	//(How do I pay bills?) Link
	@FindBy(partialLinkText = "How do I pay bills?")
	WebElement PayBillsLink;
	
	public HelpPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateTitle()
	{
		return driver.getTitle();
	}
	
	public void ClickOnLogIntoLink()
	{
		LogIntoLink.click();
	}
	public void TransferFundLink()
	{
		TransferFundsLink.click();
	}
	public void PayBillLink()
	{
		PayBillsLink.click();
	}
}


