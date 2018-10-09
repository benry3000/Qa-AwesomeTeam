package com.zero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zero.qa.base.TestBase;

public class AddNewPayeePage extends TestBase {

	@FindBy(tagName = "h2")
	WebElement addNPayHeader;

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

	// Initializing the Page Objects:
	public AddNewPayeePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateAddNewPayeePageTitle() {
		return driver.getTitle();
	}

}
