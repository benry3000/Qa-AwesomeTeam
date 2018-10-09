package com.zero.qa.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zero.qa.base.TestBase;

public class AccountSummaryPage extends TestBase {
	
	//savings link
	@FindBy(xpath = "//a[contains(text(),'Savings')]")
	WebElement savings;
	
	//second savings link
	@FindBy(xpath = "//a[@href='/bank/account-activity.html?accountId=3']")
	WebElement secondSaving;
	
	//brokerage link
	@FindBy(xpath = "//a[contains(text(),'Brokerage')]")
	WebElement brokerage;
	
	//checking link
	@FindBy(xpath = "//a[contains(text(),'Checking')]")
	WebElement checking;
	
	//credit card link
	@FindBy(xpath = "//a[contains(text(),'Credit Card')]")
	WebElement creditcard;
	
	//loan link
	@FindBy(xpath = "//a[contains(text(),'Loan')]")
	WebElement loan;
	
	public AccountSummaryPage() { 
		PageFactory.initElements(driver, this);
	}
	
	public String validateAccountSummaryPageTitle() { //get title of page
		return driver.getTitle();
	}
	
}
