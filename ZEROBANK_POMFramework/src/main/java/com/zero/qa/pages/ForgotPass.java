package com.zero.qa.pages;

import com.zero.qa.base.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ForgotPass extends TestBase
{
	// This is the email textbox on the forgot password page
	@FindBy(name ="email")
	WebElement EmailField;
	// This is the send password button on the forgot password page
	@FindBy(name ="sumbit")
	WebElement SendPasswordBtn;
	
	@FindBy(xpath="//h3[contains(text(),'Forgotten Password')]")
	WebElement ForgotHeader;
	
	public ForgotPass()
	{
		PageFactory.initElements(driver, this);
	}
	
	//verifying if on correct page
	public String verifyForgottenPassTitle()
	{
		return driver.getTitle();
	}
	
	public boolean VerifyEmailField()
	{
		return EmailField.isDisplayed();
	}
	
	public boolean VerifyHeader()
	{
		return ForgotHeader.isDisplayed();
	}
	
	public boolean verifySendBtn()
	{
		return SendPasswordBtn.isDisplayed();
	}
	
	public void InputEmailValue (String input)
	{
		EmailField.sendKeys(input);
	}
	
	public void ClickSubmitBtn()
	{
		SendPasswordBtn.click();
	}
	
	//write a method for the drop down menu email field
	public void emailDropdown(String input)
	{
		Select sel = new Select(EmailField);
		sel.deselectByVisibleText(input);
	}
	
	public void VerifyTextOnPage ()
	{
		//String str = ForgotHeader.getText();
		//Assert.assertEquals(str, "Forgotten Password");
	}
	
	
	

}
