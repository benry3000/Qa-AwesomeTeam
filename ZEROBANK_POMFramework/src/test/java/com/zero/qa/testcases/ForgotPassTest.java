package com.zero.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.ForgotPass;
import com.zero.qa.pages.Home;
import com.zero.qa.pages.LoginPage;

public class ForgotPassTest extends TestBase
{
	ForgotPass forgot;
	Home home;
	LoginPage login;
	
	public ForgotPassTest()
	{
		super();
	}
	
	@BeforeMethod
	public void SetUp()
	{
		initialization();
		home = new Home();
		home.clickOnSignin();
		login = new LoginPage();
		login.clickOnForgotPass();
		forgot = new ForgotPass();
	}
	
	@Test(priority=1)
	public void PageTest()
	{
		String str = forgot.verifyForgottenPassTitle();
		Assert.assertEquals(str, "Zero - Forgotten Password");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
