package com.zero.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.AccountActivityFindTransaction;
import com.zero.qa.pages.Home;
import com.zero.qa.pages.LoginPage;

public class AccountActivityFindTransactionTest extends TestBase{
	
	AccountActivityFindTransaction AccountActivity;
	Home home;
	LoginPage loginPage;
	public AccountActivityFindTransactionTest() 
	{
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialization();
		home = new Home();
		loginPage = new LoginPage();
		home.clickOnSignin();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		AccountActivity = new AccountActivityFindTransaction ();
		driver.findElement(By.id("account_activity_tab")).click();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = AccountActivity.validateAccountActivityTitle();
		Assert.assertEquals(title, "Zero - Account Activity");
	}
	
	@Test(priority=2)
	public void validAccountActivityFindTransaction() {
			AccountActivity.clickFindTransactions();
			AccountActivity.description("Food");
			AccountActivity.fromDate("2012-09-06");
			AccountActivity.toDate("2012-09-06");
			AccountActivity.fromAmount("10");
			AccountActivity.toAmount("500");
			AccountActivity.findTransaction("Withdrawal");
			AccountActivity.findButton();
			
		}
	
	@Test(priority=3)
	public void invalidAccountActivityFindTransaction() {
		AccountActivity.clickFindTransactions();
		AccountActivity.description("");
		AccountActivity.fromDate("66776273673321");
		AccountActivity.toDate("726346828263");
		AccountActivity.fromAmount("abc efg");
		AccountActivity.toAmount("hij klm");
		AccountActivity.findTransaction("Any");
		AccountActivity.findButton();
		}
	
	@AfterMethod
	public void tearDown(){
		//driver.close();
		driver.quit();
	}
	
} 
