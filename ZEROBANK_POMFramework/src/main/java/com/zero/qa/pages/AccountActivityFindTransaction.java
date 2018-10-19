package com.zero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zero.qa.base.TestBase;

public class AccountActivityFindTransaction extends TestBase{
	
	//clicking on Find Tansactions
	@FindBy(xpath = "//a[contains(text(),'Find Transactions')]")
	WebElement FindTransactions;
	
	//desctiption 
	@FindBy(name="description")
	WebElement description;
	
	//From Date 
	@FindBy(name="fromDate")
	WebElement fromDate;

	//To Date 
	@FindBy(name="toDate")
	WebElement toDate;

	//From Account 
	@FindBy(name="fromAmount")
	WebElement fromAmount;
	
	//To Account
	@FindBy(name="toAmount")
	WebElement toAmount;
	
	//Type
	@FindBy(name="type")
	WebElement type;
	
	//Find
	@FindBy(xpath="//button[contains(@type,'submit')]")
	WebElement find;
	
	// Initializing the Page Objects:
	public AccountActivityFindTransaction() {
		PageFactory.initElements(driver, this);
	}
	

	//Actions:
	public String validateAccountActivityTitle(){
		return driver.getTitle();
	
	}
	
	
	//this will click on find transaction
	public void clickOnFindTransaction() {
		FindTransactions.click();
	}
	
	public void findTransaction(String input5){
		Select select = new Select(type);
		select.selectByVisibleText(input5);
	}
	public void description(String input) 
	{
		description.sendKeys(input);
	}
	
	public void fromDate(String input1)
	{
		fromDate.sendKeys(input1);
	}
	
	public void toDate(String input2)
	{
		toDate.sendKeys(input2);
	}
	
	public void fromAmount(String input3) {
		fromAmount.sendKeys(input3);
	}
	
	public void toAmount(String input4)
	{
		toAmount.sendKeys(input4);
	}
	
	public void findButton() {
		// TODO Auto-generated method stub
		find.click();
	}
	public void clickFindTransactions() {
		FindTransactions.click();
	}
			
//		description.sendKeys("checking");
//		fromDate.sendKeys("2012-09-06");
//		toDate.sendKeys("2012-09-06");
//		fromAmount.sendKeys("10");
//		toAmount.sendKeys("1000");
//		find.click();
//		
	}




