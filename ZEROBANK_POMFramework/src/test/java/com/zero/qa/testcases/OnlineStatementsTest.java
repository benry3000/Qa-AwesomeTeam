package com.zero.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.OnlineStatements;

import org.testng.Assert;

public class OnlineStatementsTest extends TestBase 
{
	OnlineStatements statements;
	
	public void SetUp()
	{
		statements = new OnlineStatements();
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
		WebElement title = driver.findElement(By.partialLinkText("2011"));
		Assert.assertEquals(title, "2011");
	}
	
	@Test(priority=3)
	public void Tabs3Test()
	{
		statements.ClickOnTab2010();
		WebElement title = driver.findElement(By.partialLinkText("2010"));
		Assert.assertEquals(title, "2010");
	}
	
	@Test(priority=4)
	public void Tabs4Test()
	{
		statements.ClickOnTab2009();
		WebElement title = driver.findElement(By.partialLinkText("2009"));
		Assert.assertEquals(title, "2009");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
