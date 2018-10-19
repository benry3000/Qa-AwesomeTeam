package com.zero.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.AccountSummaryPage;
import com.zero.qa.pages.Home;
import com.zero.qa.pages.LoginPage;
import com.zero.qa.util.TestUtil;


public class AccountSummaryTest extends TestBase {
	LoginPage loginPage;
	TestUtil testUtil;
	AccountSummaryPage asp;
	Home home;
	
	public AccountSummaryTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		asp = new AccountSummaryPage();
		home = new Home();
		home.clickOnSignin();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	} 
	
	
	@Test(priority=1)
	public void verifyAccountSummaryTitleTest(){
		String title = driver.getTitle();
		Assert.assertEquals(title,"Zero - Account Summary");
	}
	
	
	@Test(priority=2)
	public void verifyBrokerageTest(){
		asp.clickOnBrokerage();
		Assert.assertEquals(driver.getTitle(), "Zero - Account Activity");
	}
	
	@Test(priority = 3)
	public void verifyCC() {
		String actual = asp.getCCNumber();
		Assert.assertEquals(actual, "VISA 4485-5368-3381-1879");
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
