package com.zero.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.Home;
import com.zero.qa.pages.LoginPage;
import com.zero.qa.pages.MyMoneyMapPage;
import com.zero.qa.util.TestUtil;

public class MyMoneyMapTest extends TestBase {

	MyMoneyMapPage myMoneyMap;
	TestUtil testUtil;
	LoginPage loginPage;
	Home home;

	public MyMoneyMapTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		myMoneyMap = new MyMoneyMapPage();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		home = new Home();
		home.clickOnSignin();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		myMoneyMap.clickOnMyMoMapTab();
	}
	
	@Test(priority=1)
	public void validateMMMTitle(){
		String purForCurTitle = myMoneyMap.validateMMMPTitle();
		Assert.assertEquals(purForCurTitle, "Zero - My Money Map");
	}
	@Test(priority=2)
	public void verifyPurForCurHeaderTest() throws InterruptedException{
		Thread.sleep(1000);
		Assert.assertTrue(myMoneyMap.verifyMMPHeader());
	}
	@Test(priority=3)
	public void mapHoverTest() throws InterruptedException {
		myMoneyMap.mapHoverPage();
	}
	
	@Test(priority=4)
	public void checkTotal() {
		Assert.assertTrue(myMoneyMap.calculateTotal());
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
