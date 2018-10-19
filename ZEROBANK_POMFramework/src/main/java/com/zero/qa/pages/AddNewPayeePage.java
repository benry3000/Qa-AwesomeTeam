package com.zero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zero.qa.base.TestBase;

public class AddNewPayeePage extends TestBase {

	@FindBy(xpath = "//a[@class='brand']")
	WebElement zeroLogo;
	
	@FindBy(id = "pay_bills_tab")
	WebElement payBillTab;
	
	@FindBy(xpath = "//*[@id=\'tabs\']/ul/li[2]/a")
	WebElement addNewPayTab;
	
	@FindBy(xpath = "//*[@id=\'ui-tabs-2\']/h2")
	WebElement addNewPayHeader;

	@FindBy(id = "np_new_payee_name")
	WebElement payeeName;

	@FindBy(id = "np_new_payee_address")
	WebElement payeeAddress;

	@FindBy(id = "np_new_payee_account")
	WebElement account;

	@FindBy(id = "np_new_payee_details")
	WebElement payeeDetails;

	@FindBy(id = "add_new_payee")
	WebElement addBtn;
	
	@FindBy(id = "alert_content")
	WebElement addConfirmation;

	// Initializing the Page Objects:
	public AddNewPayeePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String verifyAddNewPayeeTitle() {
		return driver.getTitle();
	}

	public boolean verifyZeroLogo() {
		return zeroLogo.isDisplayed();
	}
	
	public void clickOnPayBillTab(){
		payBillTab.click();
	}
	
	public void clickOnaddNewPayTab(){
		addNewPayTab.click();
	}

	public boolean verifyAddNewPayeeHeader() {
		return addNewPayHeader.isDisplayed();
	}
	
	public void payeeName(String input) {
		payeeName.sendKeys(input);
	}
	
	public void payeeAddress(String input) {
		payeeAddress.sendKeys(input);
	}
	
	public void account(String input) {
		account.sendKeys(input);
	}
	
	public void payeeDetails(String input) {
		payeeDetails.sendKeys(input);
	}
	
	public void addBtn() {
		addBtn.click();
	}
	
	public boolean addConfirmation() {
		return addConfirmation.isDisplayed();
	}
	

}
