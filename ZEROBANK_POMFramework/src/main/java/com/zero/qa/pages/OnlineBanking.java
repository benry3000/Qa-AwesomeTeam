package com.zero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zero.qa.base.TestBase;

public class OnlineBanking extends TestBase {
	
	//Shared locators between first 3 pages
	@FindBy(id = "signin_button")
	WebElement siginBtn;
	
	@FindBy(id = "Online Banking")
	WebElement onlineBanking;
	
	@FindBy(id = "feedback")
	WebElement feedback;
	
	@FindBy(id = "searchTerm")
	WebElement search;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/a")
	WebElement ZeroBankBtn;
	//End of Shared
	@FindBy(id = "account_summary_link")
	WebElement accountSummaryLink;
	
	@FindBy(id = "account_activity_link")
	WebElement accountActivityLink;
	
	@FindBy(id = "transfer_funds_link")
	WebElement transferFundsLink;
	
	@FindBy(id = "pay_bills_link")
	WebElement payBillsLink;
	
	@FindBy(id = "money_map_link")
	WebElement moneyMapLink;
	
	@FindBy(id = "online_statements_link")
	WebElement onlineStatementsLink;
	
	public OnlineBanking() { 
		PageFactory.initElements(driver, this);
	}
	
	public String validateOnlineBankingTitle() { //get title of page
		return driver.getTitle();
	}

}
