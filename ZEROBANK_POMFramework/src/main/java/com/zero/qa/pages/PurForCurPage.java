package com.zero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zero.qa.base.TestBase;

public class PurForCurPage extends TestBase {

	@FindBy(xpath = "//a[contains(text(), 'Pay Bills')]")
	WebElement payBillLink;

	@FindBy(xpath = "//a[contains(text(),'Purchase Foreign Currency')]")
	WebElement purForCurTab;

	@FindBy(tagName = "h2")
	WebElement purForCurHeader;
	
	@FindBy(id = "pc_currency")
	WebElement currencySelect;

	@FindBy(xpath = "//strong[contain(text(),'Today's Sell Rate:')]")
	WebElement sellRate;
	@FindBy(id = "sp_sell_rate")
	WebElement checkRate;

	@FindBy(id = "pc_amount")
	WebElement amount;

	@FindBy(id = "pc_inDollars_true")
	WebElement usRadio;

	@FindBy(id = "pc_inDollars_false")
	WebElement countryRadio;

	@FindBy(id = "pc_calculate_costs")
	WebElement calCostBtn;

	@FindBy(className = "control-label")
	WebElement conversionAmount;
	@FindBy(id = "pc_conversion_amount")
	WebElement checkConversion;

	@FindBy(id = "purchase_cash")
	WebElement purchaseBtn;
	
	//Foreign currency cash was successfully purchased.
	@FindBy(id = "alert_content")
	WebElement addConfirmation;
	
	@FindBy(partialLinkText = "Purchase Foreign Currency")
	WebElement PFC;
	
	

	// Initializing the Page Objects:
	public PurForCurPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String verifyPurForCurPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyPurForCurHeaderTest() {
		return purForCurHeader.isDisplayed();
	}
	
	public void selectCurrency(String pick) {
		Select select = new Select(currencySelect);
		select.selectByVisibleText(pick);
	} 
	
	public boolean verifyTodaySellRate() {
		return false;
		
	}
	
	public void amountPFC(String input) {
		amount.sendKeys(input);
	}
	
	public void radioUS() {
		usRadio.click();
	}
	
	public void radioCountry() {
		countryRadio.click();
	}
	
	public void calCostBtn() {
		calCostBtn.click();
	}
	
//	public boolean verifyConversion() {
//		return checkConversion.isDisplayed();
//	}
	
	public void purchaseBtn() {
		purchaseBtn.click();
	}
	
	public boolean purchaseConfirmation() {
		return addConfirmation.isDisplayed();
	}
	
	public void PFCClick() {
		PFC.click();
	}

}
