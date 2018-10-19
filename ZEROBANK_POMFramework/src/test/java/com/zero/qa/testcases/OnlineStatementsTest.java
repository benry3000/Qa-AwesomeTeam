package com.zero.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.Home;
import com.zero.qa.pages.LoginPage;
import com.zero.qa.pages.OnlineStatements;

public class OnlineStatementsTest extends TestBase 
{
	OnlineStatements statements;
	Home home;
	LoginPage loginPage;
	
	public OnlineStatementsTest() {
		super();// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void SetUp()
	{
		initialization();
		home = new Home();
		loginPage = new LoginPage();
		home.clickOnSignin();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		statements = new OnlineStatements();
		driver.findElement(By.id("online_statements_tab")).click();
	}
	
	@Test(priority=1)
	public void Tabs1Test()
	{
		String title = statements.verifyTitle();
		Assert.assertEquals(title, "Zero - Online Statements");
	}
	
	@Test(priority=2)
	public void Tabs2Test()
	{
		statements.ClickOnTab2011();
		statements.ClickOnTab2010();
		statements.ClickOnTab2009();
		//WebElement title = driver.findElement(By.partialLinkText("2011"));
		//Assert.assertEquals(title, "2011");
	}
	


	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
