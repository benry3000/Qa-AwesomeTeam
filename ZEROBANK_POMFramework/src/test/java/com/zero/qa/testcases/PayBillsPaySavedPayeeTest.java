package com.zero.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.Home;
import com.zero.qa.pages.LoginPage;
import com.zero.qa.pages.PayBillsPaySavedPayee;

public class PayBillsPaySavedPayeeTest extends TestBase {
	
	PayBillsPaySavedPayee PayBills;
	Home home;
	LoginPage loginPage;
	
	public PayBillsPaySavedPayeeTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		PayBills = new PayBillsPaySavedPayee();
		home = new Home();
		loginPage = new LoginPage();
		home.clickOnSignin();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.findElement(By.id("pay_bills_tab")).click();
	}
	
	@Test(priority=1)
	public void PayBillsPageTitleTest() {
		String title = PayBills.validatePayBillsTitle();
		Assert.assertEquals(title, "Zero - Pay Bills");
	}
	
	@Test(priority=2)
	public void validMakePayment() {
		PayBills.Payee("Bank of America");
		PayBills.Account("Savings");
		PayBills.Amount("300");
		PayBills.Date("2018-07-10");
		PayBills.Desciption("Money Transfer");
		PayBills.payButton();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,"http://zero.webappsecurity.com/bank/pay-bills-saved-payee.html");
	}
	
	@Test(priority=3)
	public void invalidMakePayment() {
		PayBills.Payee("Apple");
		PayBills.Account("Savings");
		PayBills.Amount("abcdefghijkmnopqrstuvwxyz");
		PayBills.Date("1234567890987654321");
		PayBills.Desciption("Money Transfer");
		PayBills.payButton();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,"http://zero.webappsecurity.com/bank/pay-bills.html");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
