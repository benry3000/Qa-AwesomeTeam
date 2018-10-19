package com.zero.qa.pages;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zero.qa.base.TestBase;

public class MyMoneyMapPage extends TestBase {

	@FindBy(id = "money_map_tab")
	WebElement myMoMapTab;

	@FindBy(id = "ext-sprite-1129")
	WebElement moneyMapHeader;

	@FindBy(xpath = "//*[@id='gridview-1015-bd-Deposits']/td/table/tbody/tr[2]/td[2]/div")
	WebElement dd;
	@FindBy(xpath = "//*[@id=\"gridview-1015-bd-Deposits\"]/td/table/tbody/tr[3]/td[2]/div")
	WebElement od;
	@FindBy(xpath = "//*[@id=\"gridview-1015-bd-Deposits\"]/td/table/tbody/tr[4]/td[2]/div")
	WebElement td;
	@FindBy(xpath = "//*[@id=\"gridview-1015\"]/table/tbody/tr[4]/td[2]/div/b")
	WebElement total;

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
	@FindBy(id = "ext-sprite-1878")
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
	@FindBy(xpath = "//*[@id=\"gridview-1015-bd-Deposits\"]/td/table/tbody/tr[3]/td[2]/div")
	WebElement d;
	@FindBy(xpath = "//*[@id=\"gridview-1015-bd-Deposits\"]/td/table/tbody/tr[4]/td[2]/div")
	WebElement t;
	@FindBy(xpath = "//*[@id=\"gridview-1015\"]/table/tbody/tr[4]/td[2]/div")
	WebElement a;
	
	//
	
	// Initializing the Page Objects:
	public MyMoneyMapPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateMMMPTitle() {
		return driver.getTitle();
	}

	public boolean verifyMMPHeader() {
		return moneyMapHeader.isDisplayed();
	}

	public void clickOnMyMoMapTab() {
		myMoMapTab.click();
	}

	public void mapHoverPage() throws InterruptedException {
		Actions act = new Actions(driver);
		// hover and click Transportation
		act.moveToElement(transportationHover).build().perform();
		Thread.sleep(1000);
		act.moveToElement(autoHover).build().perform();
		Thread.sleep(1000);
		act.moveToElement(charityHover).build().perform();
		Thread.sleep(1000);
		act.moveToElement(checkWrittenHover).build().perform();
		Thread.sleep(1000);
		act.moveToElement(retailsHover).build().perform();
		Thread.sleep(1000);
		act.moveToElement(houseHoldHover).build().perform();
		Thread.sleep(1000);
		act.moveToElement(insuranceHover).build().perform();
		Thread.sleep(1000);
		act.moveToElement(officeSupplyHover).build().perform();
		Thread.sleep(1000);
		act.moveToElement(restaurantsHover).build().perform();
		Thread.sleep(1000);
		transportation.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(text(),'Transportation') and @dy='3.5']")).click();
		Thread.sleep(1000);
	}
	
	public boolean calculateTotal() {
		String[] parts = d.getText().split("\\$");
		
		parts = parts[1].split(",");
		
		double b = Double.parseDouble(parts[0].toString() + parts[1].toString());
		
		parts = t.getText().split("\\$");
		parts = parts[1].split(",");
		
		double c = Double.parseDouble(parts[0].toString() + parts[1].toString());

		parts = a.getText().split("\\$");
		parts = parts[1].split(",");
		
		double ans = Double.parseDouble(parts[0].toString() + parts[1].toString());
		
		if(b+c == ans)
			return true;
		return false;
		
	}

}
