package com.zero.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.FeedBack;
import com.zero.qa.pages.Home;
import com.zero.qa.pages.OnlineBanking;

public class HomeTest extends TestBase{
	
	Home home;
	OnlineBanking ob;
	public HomeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		home = new Home();
		ob = new OnlineBanking();
	}
	
	@Test(priority=1) //title
	public void validateTitle() {
		String title = home.validateHomeTitle();
		Assert.assertEquals(title, "Zero - Personal Banking - Loans - Credit Cards");
		
	}
	
	@Test(priority=2) //Click Online Banking
	public void validateOnlineBanking() {
		home.clickOnOnlineBanking();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Zero - Free Access to Online Banking");
		
	}
	
	
	

	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
