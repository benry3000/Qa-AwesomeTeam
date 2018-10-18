package com.zero.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.zero.qa.base.TestBase;
import com.zero.qa.pages.Home;
import com.zero.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	Home home;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		home = new Home();
		home.clickOnSignin();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Zero - Log in");
	}
	
	@Test(priority=2)
	public void crmLogoImageTest(){
		boolean flag = loginPage.validateZEROLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest(){
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=4)
	public void validateCheckBoxTest(){
		loginPage.clickOnCheckBox();
		boolean flag = loginPage.validateCheckBox();
		Assert.assertTrue(flag);
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}