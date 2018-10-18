package com.zero.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.util.TestUtil;
import com.zero.qa.base.TestBase;
import com.zero.qa.pages.AddNewPayeePage;

public class AddNewPayeeTest extends TestBase{
	
	AddNewPayeePage addNewPayee;
	TestUtil testUtil;
	
	
	public AddNewPayeeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
	}
	
	@Test(priority=1)
	public void verifyAddNewPayeeTitleTest(){
		String addNewPayeeTitle = addNewPayee.verifyAddNewPayeeTitle();
		Assert.assertEquals(addNewPayeeTitle, "Zero - Pay Bills", "Add New Payee title not matched");
	}
	
	@Test(priority=2)
	public void verifyAddNewPayeeHeaderTest(){
		Assert.assertTrue(addNewPayee.verifyAddNewPayeeHeader());
	}
	
	@Test(priority=3)
	public void validAddNewPayeeInput() {
		addNewPayee.payeeName("Ankit");
		addNewPayee.payeeAddress("4400 Capital Blvd \n"+"Raleigh, NC");
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
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
	
	

}
