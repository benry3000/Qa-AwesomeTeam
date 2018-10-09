package com.zero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zero.qa.base.TestBase;

public class MyMoneyMapPage extends TestBase {

	@FindBy(id = "ext-sprite-1271")
	WebElement transportationHover;
	@FindBy(id = "ext-sprite-1151")
	WebElement transportation;

	@FindBy(id = "ext-sprite-1272")
	WebElement autoHover;
	@FindBy(id = "ext-sprite-1155")
	WebElement auto;

	@FindBy(id = "ext-sprite-1273")
	WebElement charityHover;
	@FindBy(id = "ext-sprite-1159")
	WebElement charity;

	@FindBy(id = "ext-sprite-1274")
	WebElement checkWrittenHover;
	@FindBy(id = "ext-sprite-1163")
	WebElement checkWritten;

	@FindBy(id = "ext-sprite-1275")
	WebElement retailsHover;
	@FindBy(id = "ext-sprite-1167")
	WebElement retails;

	@FindBy(id = "ext-sprite-1276")
	WebElement houseHoldHover;
	@FindBy(id = "ext-sprite-1171")
	WebElement houseHold;

	@FindBy(id = "ext-sprite-1277")
	WebElement insuranceHover;
	@FindBy(id = "ext-sprite-1175")
	WebElement insurance;

	@FindBy(id = "ext-sprite-1278")
	WebElement officeSupplyHover;
	@FindBy(id = "ext-sprite-1179")
	WebElement officeSupply;

	@FindBy(id = "ext-sprite-1279")
	WebElement restaurantsHover;
	@FindBy(id = "ext-sprite-1183")
	WebElement restaurants;

	@FindBy(id = "ext-sprite-1280")
	WebElement telecomHover;
	@FindBy(id = "ext-sprite-1187")
	WebElement telecom;

	// Initializing the Page Objects:
	public MyMoneyMapPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateMyMoneyMapPageTitle() {
		return driver.getTitle();
	}

}
