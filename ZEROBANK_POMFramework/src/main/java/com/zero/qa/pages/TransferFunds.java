package com.zero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zero.qa.base.TestBase;

public class TransferFunds extends TestBase{
	
	//click on transfer funds tab
	@FindBy(xpath = "//a[contains(text(),'Transfer Funds')]")
	WebElement transferFunds;
	
	//from account id
	@FindBy(name="fromAccountId")
	WebElement fromAccountId;
	
	//To account id
	@FindBy(name="toAccountId")
	WebElement toAccountId;
	
	//amount
	@FindBy(name="amount")
	WebElement amount;
	
	//description
	@FindBy(name="description")
	WebElement description;
	
	//continue button
	@FindBy(xpath="//img[contains(@id,'btn_submit')]")
	WebElement submitButton;

	public TransferFunds() { 
		PageFactory.initElements(driver, this);
	}
	
	public String validateTransferFundsTitle() { //get title of page
		return driver.getTitle();
	}
}
