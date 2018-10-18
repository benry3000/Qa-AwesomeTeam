package com.zero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zero.qa.base.TestBase;

public class PayBillsPaySavedPayee extends TestBase{
	
	//click on pay bills tab
	@FindBy(xpath = "//a[contains(text(),'Pay Bills')]")
	WebElement payBills;
	
	//click on pay saved payee
	@FindBy(xpath = "//a[contains(text(),'Pay Saved Payee')]")
	WebElement paySavedPayee;
	
	//payee
	@FindBy(name="payee")
	WebElement payee;
	
	//account
	@FindBy(name="account")
	WebElement account;
	
	//amount
	@FindBy(name="amount")
	WebElement amount;
	
	//date
	@FindBy(name="date")
	WebElement date;
	
	
	//description
	@FindBy(name="description")
	WebElement description;
	
	//click pay
	@FindBy(id ="pay_saved_payees")
	WebElement submit;
	
	@FindBy(partialLinkText="The payment was successfully submitted.")
	WebElement successPage;
	
	// Initializing the Page Objects:	
	public PayBillsPaySavedPayee() {
		PageFactory.initElements(driver, this);
	}
	
	//action
	public String validatePayBillsTitle() {
		return driver.getTitle();
	}
	
	//click on the pay Bills
	public void clickOnPayBills() {
		payBills.click();
	}
	
	public void Payee(String input){
		Select select = new Select(payee);
		select.selectByVisibleText(input);
	}
	
	public void Account(String input1){
		Select select = new Select(account);
		select.selectByVisibleText(input1);
	}
	
	public void Amount(String input2) 
	{
		amount.sendKeys(input2);
	}
	
	public void Date(String input3) 
	{
		date.sendKeys(input3);
	}
	
	
	public void Desciption(String input4) 
	{
		description.sendKeys(input4);
	}
	
	public void payButton() {
		submit.click();
	}
	
	public boolean verifysuccessPage() {
		return successPage.isDisplayed();
	}
	
	
	
	
		
		

}
