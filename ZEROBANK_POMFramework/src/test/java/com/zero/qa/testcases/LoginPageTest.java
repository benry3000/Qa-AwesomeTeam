package com.zero.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.zero.qa.base.TestBase;
import com.zero.qa.pages.Home;
import com.zero.qa.pages.LoginPage;
import com.zero.qa.util.myThread;

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
	/*
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
	
	@Test(priority=5)
	public void stressTest() throws IOException //Stress Test the Login Page
	{
		loginPage.stressInput(); //40 input cases
	}
	
	@Test(priority=6)
	public void spikeTest() throws InterruptedException //Spike Test Login Page
, IOException
	{
		loginPage.spikeInput();
	}*/
	
	@Test(priority=7)
	public void BreakingTheSite() throws InterruptedException //Spike Test Login Page
, IOException
	{
		
		for(int i = 0; i < 10; i++)
		{
		myThread t1 = new myThread();
		myThread t2 = new myThread();
		myThread t3 = new myThread();
		t1.start();
		t2.start();
		//t3.start();
		t1.join();
		t2.join();
		//t3.join();
		}

		
	}
	

	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}