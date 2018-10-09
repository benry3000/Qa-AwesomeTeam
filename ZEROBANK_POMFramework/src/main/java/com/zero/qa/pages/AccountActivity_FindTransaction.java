package com.zero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zero.qa.base.TestBase;

public class AccountActivity_FindTransaction extends TestBase{
	
	//clicking on Find Tansactions
	@FindBy(xpath = "//a[contains(text(),'Find Transactions')]")
	WebElement FindTransactions;
	
	//desctiption 
	@FindBy(name="description")
	WebElement description;
	
	//From Date 
	@FindBy(name="fromDate")
	WebElement fromDate;

	//To Date 
	@FindBy(name="toDate")
	WebElement toDate;

	//From Account 
	@FindBy(name="fromAmount")
	WebElement fromAmount;
	
	//To Account
	@FindBy(name="toAmount")
	WebElement toAmount;
	
	//Type
	@FindBy(name="type")
	WebElement type;
	
	//Find
	@FindBy(xpath="//img[contains(@type,'submit')]")
	WebElement find;
	
	public AccountActivity_FindTransaction() { 
		PageFactory.initElements(driver, this);
	}
	
	public String validateAccountActivity_FindTransactionTitle() { //get title of page
		return driver.getTitle();
	}
	
}



