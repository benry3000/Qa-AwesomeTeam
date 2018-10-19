package com.zero.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.AccountSummaryPage;
import com.zero.qa.pages.HelpPage;
import com.zero.qa.pages.Home;
import com.zero.qa.pages.LoginPage;

public class HelpPage_Test  extends TestBase
{
	HelpPage help;
	LoginPage loginPage;
	Home home;
	AccountSummaryPage asp;
	
	public HelpPage_Test()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage = new LoginPage();
		home = new Home();
		home.clickOnSignin();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		asp = new AccountSummaryPage();
		asp.clickOnSettingsHelp();
		help = new HelpPage();
	}
	
	@Test(priority=1)
	public void ValidateTitle() {
		String valid1 = help.ValidateTitle();
		Assert.assertEquals(valid1, "Zero - Help");
	}
	
	@Test(priority=2)
	public void TransferFundsTitle()
	{
		help.TransferFundLink();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Zero - Help");
	}
	
	@Test(priority=3)
	public void PayBillTitle()
	{
		help.PayBillLink();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Zero - Help");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
