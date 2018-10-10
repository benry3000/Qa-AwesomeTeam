package com.zero.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.Home;
import com.zero.qa.pages.OnlineBanking;

public class OnlineBankingTest extends TestBase {
	
	OnlineBanking onlinebanking;
	
	public OnlineBankingTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		onlinebanking = new OnlineBanking();
	}
	
	@Test(priority=1) //title
	public void validateTitle() {
		String title = onlinebanking.validateOnlineBankingTitle();
		Assert.assertEquals(title, "Zero - Free Access to Online Banking");
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
