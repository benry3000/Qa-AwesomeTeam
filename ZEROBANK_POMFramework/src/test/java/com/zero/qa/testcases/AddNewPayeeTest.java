package com.zero.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.util.TestUtil;
import com.zero.qa.pages.LoginPage;
import com.zero.qa.base.TestBase;
import com.zero.qa.pages.AddNewPayeePage;
import com.zero.qa.pages.Home;

public class AddNewPayeeTest extends TestBase{
	
	AddNewPayeePage addNewPayee;
	TestUtil testUtil;
	LoginPage loginPage;
	Home home;
	
	
	public AddNewPayeeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		addNewPayee = new AddNewPayeePage();
		loginPage = new LoginPage();
		home = new Home();
		home.clickOnSignin();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		addNewPayee.clickOnPayBillTab();
		addNewPayee.clickOnaddNewPayTab();
		//addNewPayee.clickOnaddNewPayTab();
		
	}
	
	@Test(priority=1)
	public void verifyAddNewPayeeTitleTest(){
		String addNewPayeeTitle = driver.getTitle();
		Assert.assertEquals(addNewPayeeTitle, "Zero - Pay Bills");
	}
	
	@Test(priority=2)
	public void verifyAddNewPayeeHeaderTest(){
		Assert.assertTrue(addNewPayee.verifyAddNewPayeeHeader());
	}
	
	@Test(priority=3)
	public void validAddNewPayeeInput() {
		addNewPayee.payeeName("Ankit");
		addNewPayee.payeeAddress("4400 Capital Blvd, Raleigh, NC");
		addNewPayee.account("46001234");
		addNewPayee.payeeDetails("Chipotle");
		addNewPayee.addBtn();
		Assert.assertTrue(addNewPayee.addConfirmation());
	}
	
//	@Test(priority=4)
//	public void invalidAddNewPayeeInput(){
//		addNewPayee.payeeName("");
//		addNewPayee.payeeAddress("4400 Capital Blvd \n"+"Raleigh, NC");
//		addNewPayee.account("46001234");
//		addNewPayee.payeeDetails("Chipotle");
//		addNewPayee.addBtn();
//		Assert.assertTrue(addNewPayee.addConfirmation());
//	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	

}
