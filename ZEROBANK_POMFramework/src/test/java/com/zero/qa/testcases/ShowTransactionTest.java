package com.zero.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.ShowTransaction;
import com.zero.qa.pages.LoginPage;
import com.zero.qa.pages.AccountSummaryPage;
import com.zero.qa.pages.Home;
import com.zero.qa.util.TestUtil;

public class ShowTransactionTest extends TestBase {
		
		Home home;
		LoginPage loginPage;
		TestUtil testUtil;
		ShowTransaction ShowTransaction;
		//AccountSummary AccountSummaryPage;
		
		public ShowTransactionTest() {
			super();
		}
		
		@BeforeMethod
		public void setUp() {
			initialization();
			testUtil = new TestUtil();
			//AccountSummary = new AccountSummaryPage();
			ShowTransaction = new ShowTransaction();
			home = new Home();
			loginPage = new LoginPage();
			home.clickOnSignin();
			loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
		
		
		@Test(priority=1)
		public void verifySavingsTest(){
			ShowTransaction.clickOnSavings();
			Assert.assertEquals(driver.getTitle(), "Zero - Account Activity");
		}
		
		@AfterMethod
		public void tearDown() {
			driver.close();
			driver.quit();
		}




}
