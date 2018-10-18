package com.zero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zero.qa.base.TestBase;

public class AddNewPayeePage extends TestBase {

	@FindBy(xpath = "//a[@class='brand']")
	WebElement zeroLogo;
	
	@FindBy(xpath = "//a[@href='#ui-tabs-2')]")
	WebElement addNewPayTab;

	@FindBy(xpath = "//h2[contains(text(),'Who are you paying?')]")
	WebElement addNewPayHeader;

	@FindBy(id = "np_new_payee_name")
	WebElement payeeName;

	@FindBy(xpath = "//label[@for='np_new_payee_address']")
	WebElement payeeAddress;

	@FindBy(xpath = "//label[@for='np_new_payee_account']")
	WebElement account;

	@FindBy(xpath = "//label[@for='np_new_payee_details']")
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
