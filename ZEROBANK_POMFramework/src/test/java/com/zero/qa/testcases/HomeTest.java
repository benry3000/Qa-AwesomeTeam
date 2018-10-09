package com.zero.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.FeedBack;
import com.zero.qa.pages.Home;

public class HomeTest extends TestBase{
	
	Home home;
	public HomeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		home = new Home();
	}
	
	@Test(priority=1) //title
	public void validateTitle() {
		String title = home.validateHomeTitle();
		Assert.assertEquals(title, "Zero - Contact Us");
	}
	

	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
