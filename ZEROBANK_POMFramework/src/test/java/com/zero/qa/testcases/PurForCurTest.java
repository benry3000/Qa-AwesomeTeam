package com.zero.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.Home;
import com.zero.qa.pages.LoginPage;
import com.zero.qa.pages.PurForCurPage;

public class PurForCurTest extends TestBase{
	
	PurForCurPage purForCur;
	Home home;
	LoginPage loginPage;
	public PurForCurTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		home = new Home();
		loginPage = new LoginPage();
		home.clickOnSignin();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		purForCur = new PurForCurPage();
		driver.findElement(By.id("pay_bills_tab")).click();
		purForCur.PFCClick();
		
	}
	
	@Test(priority=1)
	public void verifyPurForCurTitleTest(){
		
		String purForCurTitle = purForCur.verifyPurForCurPageTitle();
		Assert.assertEquals(purForCurTitle, "Zero - Pay Bills", "Purchase Foreign Currency title not matched");
	}
	
	
	@Test(priority=2)
	public void validTest_1() {
		purForCur.selectCurrency("Eurozone (euro)");
		purForCur.amountPFC("2");
		purForCur.radioUS();
		//purForCur.radioCountry();
		purForCur.purchaseBtn();
		Assert.assertTrue(purForCur.purchaseConfirmation());
	}

	
	@Test(priority=3)
	public void validTest_2() {
		purForCur.selectCurrency("Eurozone (euro)");
		purForCur.amountPFC("3");
		//purForCur.radioUS();
		purForCur.radioCountry();
		purForCur.purchaseBtn();
		Assert.assertTrue(purForCur.purchaseConfirmation());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
