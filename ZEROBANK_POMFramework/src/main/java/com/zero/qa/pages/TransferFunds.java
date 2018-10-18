package com.zero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zero.qa.base.TestBase;

public class TransferFunds extends TestBase{
	
	//click on transfer funds tab
	@FindBy(id = "transfer_funds_tab")
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
	@FindBy(id="btn_submit")
	WebElement submitButton;
	
	@FindBy(id="btn_submit")
	WebElement submit1;
	
	@FindBy(partialLinkText="You successfully submitted your transaction.")
	WebElement submitted;
	
	
	// Initializing the Page Objects:
	public TransferFunds() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String ValidateTransferFundTitle(){
		return driver.getTitle();
	}
	
	//this will click on find transaction
	public void clickOnTransferFund() {
		transferFunds.click();
	}
	
	public void fromAccount(String input){
		Select select = new Select(fromAccountId);
		select.selectByVisibleText(input);
		
	}
	
	public void toAccount(String input1){
		Select select = new Select(toAccountId);
		select.selectByVisibleText(input1);
		
	}
	
	public void Amount(String input3) {
		amount.sendKeys(input3);
	}
	
	public void Description(String input4) {
		description.sendKeys(input4);
	}

	public void Submit() {
		submitButton.click();
	}
	
	public void Submit1() {
		submit1.click();
	}
	


}
