package com.zero.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.Home;
import com.zero.qa.pages.LoginPage;
import com.zero.qa.pages.PurForCurPage;
import com.zero.qa.util.TestUtil;

public class PurForCurTest extends TestBase{
	
	PurForCurPage purForCur;
	TestUtil testUtil;
	LoginPage loginPage;
	Home home;
	public PurForCurTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		purForCur = new PurForCurPage();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		home = new Home();
		home.clickOnSignin();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		purForCur.clickOnPayBillTab();
		purForCur.clickOnpurFurCurTab();
	}
	
	@Test(priority=1)
	public void verifyPurForCurTitleTest(){
		String purForCurTitle = purForCur.verifyPurForCurPageTitle();
		Assert.assertEquals(purForCurTitle, "Zero - Pay Bills", "Purchase Foreign Currency title not matched");
	}
	
	@Test(priority=2)
	public void verifyPurForCurHeaderTest(){
		Assert.assertTrue(purForCur.verifyPurForCurHeaderTest());
	}
	
	@Test(priority=3)
	public void validTest_1() {
		purForCur.selectCurrency("Eurozone (euro)");
		purForCur.amountPFC("2");
		purForCur.radioUS();
		//purForCur.radioCountry();
		purForCur.purchaseBtn();
		Assert.assertTrue(purForCur.purchaseConfirmation());
	}

	
//	@Test(priority=4)
//	public void validTest_2() {
//		purForCur.selectCurrency("Eurozone (euro)");
//		purForCur.amountPFC("3");
//		//purForCur.radioUS();
//		purForCur.radioCountry();
//		purForCur.purchaseBtn();
//		Assert.assertTrue(purForCur.purchaseConfirmation());
//	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
