package com.zero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zero.qa.base.TestBase;

public class PurForCur extends TestBase {

	@FindBy(xpath = "//a[contains(text(), 'Pay Bills')]")
	WebElement payBillLink;

	@FindBy(xpath = "//a[contains(text(),'Purchase Foreign Currency')]")
	WebElement purForCurTab;

	@FindBy(tagName = "h2")
	WebElement purForCurHeader;

	@FindBy(xpath = "//strong[contain(text(),'Today's Sell Rate:')]")
	WebElement sellRate;
	@FindBy(id = "sp_sell_rate")
	WebElement checkRate;

	@FindBy(id = "pc_amount")
	WebElement amount;

	@FindBy(id = "pc_currency")
	WebElement currencySelect;

	@FindBy(id = "pc_inDollars_true")
	WebElement usRadio;

	@FindBy(id = "pc_inDollars_false")
	WebElement countryRadio;

	@FindBy(id = "pc_calculate_costs")
	WebElement calCost;

	@FindBy(className = "control-label")
	WebElement conversionAmount;
	@FindBy(id = "pc_conversion_amount")
	WebElement checkConversion;

	@FindBy(id = "purchase_cash")
	WebElement purchaseBtn;

	// Initializing the Page Objects:
	public PurForCur() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validatePurForCurPageTitle() {
		return driver.getTitle();
	}

}
