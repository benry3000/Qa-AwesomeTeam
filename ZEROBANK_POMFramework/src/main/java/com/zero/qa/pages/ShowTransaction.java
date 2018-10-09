package com.zero.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zero.qa.base.TestBase;

public class ShowTransaction extends TestBase {
	
	//show transactions link
		@FindBy(xpath = "//a[contains(text(),'Show Transactions')]")
		WebElement showTransactions;
	
	//show transactions 
		@FindBy(name = "accountId")
		WebElement accountId;
	
		public ShowTransaction() { 
			PageFactory.initElements(driver, this);
		}
		
		public String validateShowTransactionTitle() { //get title of page
			return driver.getTitle();
		}
}
