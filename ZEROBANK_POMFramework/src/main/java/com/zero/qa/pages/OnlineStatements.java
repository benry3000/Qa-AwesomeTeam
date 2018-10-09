package com.zero.qa.pages;

import com.zero.qa.base.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineStatements extends TestBase 
{
	//This is the drop down menu of the Account Tab on the Online Statements Page
	@FindBy(name ="accountId")
	WebElement AccountMenu;
	
	//Under the Account Savings Tab, this is the 2012 Element of Recent Statements
	@FindBy(xpath = "//a[containstext(),'2012']")
	WebElement Tab2012;
	
	//Under the Account Savings Tab, this is the 2011 Element of Recent Statements
	@FindBy(xpath = "//a[containstext(),'2011']")
	WebElement Tab2011;
		
		//Under the Account Savings Tab, this is the 2010 Element of Recent Statements
	@FindBy(xpath = "//a[containstext(),'2010']")
	WebElement Tab2010;
	
	//Under the Account Savings Tab, this is the 2009 Element of Recent Statements
	@FindBy(xpath = "//a[containstext(),'2009']")
	WebElement Tab2009;
	
	public OnlineStatements() { 
		PageFactory.initElements(driver, this);
	}
	
	public String validateOnlineStatementsTitle() { //get title of page
		return driver.getTitle();
	}
}
