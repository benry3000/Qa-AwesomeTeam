package com.zero.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zero.qa.base.TestBase;

public class ShowTransaction extends TestBase {
	
	//show transactions link
		@FindBy(xpath = "//a[contains(text(),'Show Transactions')]")
		WebElement showTransactions;
	
	//show transactions 
		@FindBy(name = "accountId")
		WebElement accountId;
		
		@FindBy(xpath = "//a[contains(text(),'Savings')]")
		WebElement savings;
		
		// Initializing the Page Objects:
		public ShowTransaction() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyShowTransactionTitle(){
			return driver.getTitle();
		}
		
		public boolean verifyAccountID(){
			return accountId.isDisplayed();
		}
		
		public void verifyAccount(String name){
			Select select = new Select(driver.findElement(By.name("accountId")));
			select.selectByVisibleText(name);	
		}
		
		public void clickOnSavings() {
			savings.click();			
		}
	
}
