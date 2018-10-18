package com.zero.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.Home;
import com.zero.qa.pages.LoginPage;
import com.zero.qa.pages.TransferFunds;

public class TransferFundsTest extends TestBase {
	TransferFunds transferFund;
	
	Home home;
	LoginPage loginPage;
	
	
	public TransferFundsTest() 
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
		
		transferFund = new TransferFunds ();
		transferFund.clickOnTransferFund();
	}
	
	
	@Test(priority=1)
	public void validAccountActivityFindTransaction() {
		
		transferFund.fromAccount("Savings(Avail. balance = $ 1000)");
		transferFund.toAccount("Savings(Avail. balance = $ 1548)");
		transferFund.Amount("300");
		transferFund.Description("Weekly Transfer");
		transferFund.Submit();
		transferFund.Submit1();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,"http://zero.webappsecurity.com/bank/transfer-funds-confirm.html");
		
	}
	
	@Test(priority=2)
	public void invalidAccountActivityFindTransaction() //suppose to fail
	{
		
		
		transferFund.fromAccount("Savings(Avail. balance = $ 1000)");
		transferFund.toAccount("Savings(Avail. balance = $ 1000)");
		transferFund.Amount("30000");
		transferFund.Description("Weekly Transfer");
		transferFund.Submit();
		transferFund.Submit1();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,"http://zero.webappsecurity.com/bank/transfer-funds.html");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
