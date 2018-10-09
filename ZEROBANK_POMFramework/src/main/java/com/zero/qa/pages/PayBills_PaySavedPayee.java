package com.zero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zero.qa.base.TestBase;

public class PayBills_PaySavedPayee extends TestBase{
	
	//click on pay bills tab
	@FindBy(xpath = "//a[contains(text(),'Pay Bills')]")
	WebElement payBills;
	
	//click on pay saved payee
	@FindBy(xpath = "//a[contains(text(),'Pay Saved Payee')]")
	WebElement paySavedPayee;
	
	//amount
	@FindBy(name="payee")
	WebElement payee;
	
	//amount
	@FindBy(name="account")
	WebElement account;
	
	//amount
	@FindBy(name="date")
	WebElement date;
	
	//amount
	@FindBy(name="description")
	WebElement description;
	
	//click pay
	@FindBy(xpath="//img[contains(@id,'pay_saved_payees')]")
	WebElement submit;
	
	public PayBills_PaySavedPayee() { 
		PageFactory.initElements(driver, this);
	}
	
	public String validatePayBills_PaySavedPayeeTitle() { //get title of page
		return driver.getTitle();
	}
	
		
		

}
