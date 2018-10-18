package com.zero.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.MyMoneyMapPage;

public class MyMoneyMapTest extends TestBase {

	MyMoneyMapPage myMoneyMap;

	public MyMoneyMapTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		myMoneyMap = new MyMoneyMapPage();
	}
	
	@Test(priority=1)
	public void validateMMMTitle(){
		String purForCurTitle = myMoneyMap.validateMMMPTitle();
		Assert.assertEquals(purForCurTitle, "Zero - My Money Map", "My Money Map title not matched");
	}
	
	@Test(priority=2)
	public void verifyPurForCurHeaderTest(){
		Assert.assertTrue(myMoneyMap.verifyMMPHeader());
	}
	
	public void mapHoverTest() {
		myMoneyMap.mapHoverPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
