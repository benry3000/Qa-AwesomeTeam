package com.zero.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zero.qa.base.TestBase;

public class Home extends TestBase{

	//Shared locators between first 3 pages
	
	//Sign in button
	@FindBy(id = "signin_button")
	WebElement siginBtn;	
	//Online Banking link
	@FindBy(id = "onlineBankingMenu")
	WebElement onlineBanking;
	//Feedback Link
	@FindBy(id = "feedback")
	WebElement feedback;
	//Search bar
	@FindBy(id = "searchTerm")
	WebElement search;
	//Home logo
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/a")
	WebElement ZeroBankBtn;
	//End of Shared
	//More services link
	@FindBy(id = "online-banking")
	WebElement moreServicesBtn;
	//Account activity link
	@FindBy(id = "account_activity_link")
	WebElement accountActivityLink;
	//Transfer funds link
	@FindBy(id = "transfer_funds_link")
	WebElement transferFundsLink;
	//Money map Link
	@FindBy(id = "money_map_link")
	WebElement moneyMapLink;
	//Move carousel right
	@FindBy(xpath = "//*[@id=\"carousel\"]/a[2]")
	WebElement right;
	//Move carousel left
	@FindBy(xpath = "//*[@id=\"carousel\"]/a[1]")
	WebElement left;
	
	public Home() { 
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomeTitle() { //get title of page
		return driver.getTitle();
	}
	
	
	public void clickOnOnlineBanking() { //click on onlinebanking tab
		onlineBanking.click();
	}
	
	public FeedBack clickOnFeedBack() { //click on Feedback

		feedback.click();
		return new FeedBack();
	}
	
	public void clickOnMoreServices() { //click on More Services
		Actions action = new Actions(driver);
		action.moveToElement(moreServicesBtn).build().perform();
		moreServicesBtn.click();
	}
	
	public void clickOnCheckAccountActivity() { //click on Account Activity

		accountActivityLink.click();
	}
	
	public void clickOnTransferFunds() { //click on transfer funds
		accountActivityLink.click();
	}
	public void clickOnMyMoneyMap() { //click on money map
		moneyMapLink.click();
	}
	public void clickOnSignin() { //click on sign in
		siginBtn.click();
	}
	
	public void searchType(String i) // click 
	{
		search.sendKeys(i);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
	}
}

/*
home Ben
feedback Ben
online banking Ben
login Aish
account summary Aish 
account activity(show transaction) Aish
account activity (find transaction) Rudra
transfer funds Rudra
paybills(pay saved people) Rudra
pay bills(add new payee) Ankit
pay bills(purchase foreign currency) Ankit
my moneymap Ankit
online statements Hassan
help Hassan
forgotten password Hassan
*/