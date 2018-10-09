package com.zero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zero.qa.base.TestBase;

public class FeedBack extends TestBase {
	
	//Shared top navigation bar
	//Sign in button
	@FindBy(id = "signin_button")
	WebElement siginBtn;
	//Search bar
	@FindBy(id = "searchTerm")
	WebElement search;
	//Home Logo
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/a")
	WebElement ZeroBankBtn;
	//end of
	//FAQ link
	@FindBy(id = "faq-link")
	WebElement faqLink;
	//name
	@FindBy(id = "name")
	WebElement name;
	//email
	@FindBy(id = "email")
	WebElement email;
	//subject
	@FindBy(id = "subject")
	WebElement subject;
	//comment box
	@FindBy(id = "comment")
	WebElement comment;
	// submit button
	@FindBy(name = "submit")
	WebElement submit;
	//clear fields
	@FindBy(name = "clear")
	WebElement clear;
	
	public FeedBack() { 
		PageFactory.initElements(driver, this);
	}
	
	public String validateFeedBackTitle() { //get title of page
		return driver.getTitle();
	}
	
	public void clickOnFaq() { //click on faq link

		faqLink.click();
	}
	public void clickOnSubmit() { //click on send message

		submit.click();
	}
	public void clickOnClear() { //click on clear

		clear.click();
	}
	public void nameType(String i) // type in name field 
	{
		name.sendKeys(i);
	}
	public void emailType(String i) // type in email field 
	{
		email.sendKeys(i);
	}
	public void subjectType(String i) // type in subject field 
	{
		email.sendKeys(i);
	}
	public void commentType(String i) // type in comment field 
	{
		comment.sendKeys(i);
	}
}
