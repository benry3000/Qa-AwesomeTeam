package com.zero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zero.qa.base.TestBase;

public class AccountSummaryPage extends TestBase {
	
	//account activity link
	@FindBy(xpath = "//a[contains(text(),'Account Activity')]")
	WebElement accountactivity;

	//account summary link
	@FindBy(xpath = "//a[contains(text(),'Account Summary')]")
	WebElement accountsummary;
		
	//savings link
	@FindBy(xpath = "//a[contains(text(),'Savings')]")
	WebElement savings;
	
//	//second savings link
//	@FindBy(xpath = "//a[@href='/bank/account-activity.html?accountId=3']")
//	WebElement secondSaving;
	
	//brokerage link
	@FindBy(xpath = "//a[contains(text(),'Brokerage')]")
	WebElement brokerage;
	
	//checking link
	@FindBy(xpath = "//a[contains(text(),'Checking')]")
	WebElement checking;
	
	//credit card link
	@FindBy(xpath = "//a[contains(text(),'Credit Card')]")
	WebElement creditcard;
	
	//loan link
	@FindBy(xpath = "//a[contains(text(),'Loan')]")
	WebElement loan;
	
	@FindBy(xpath = "//*[@id=\"settingsBox\"]/ul/li[2]/a")
	WebElement settings;
	
	@FindBy(id = "help_link")
	WebElement help;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[3]/div/table/tbody/tr[1]/td[2]")
	WebElement ccNum;
	
	// Initializing the Page Objects:
	public AccountSummaryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyAccountSummaryTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyCorrectActivitySummary(){
		return accountsummary.isDisplayed();
	}
	
	public boolean verifyCorrectCreditCard(){
		return creditcard.isDisplayed();
	}
	
	public void clickOnBrokerage() {
		brokerage.click();
		//Actions action = new Actions(driver);
		//action.contextClick(brokerage).build().perform();
		
	}
	public void clickOnSettingsHelp() {
		settings.click();
		help.click();
	}
	public String getCCNumber() {
		return ccNum.getText();
	}
}
