package com.zero.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.FeedBack;
import com.zero.qa.pages.Home;


public class FeedBackTest extends TestBase {

	FeedBack feedback;
	Home homePage;
	public FeedBackTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new Home();
		feedback = homePage.clickOnFeedBack();
	}
	
	@Test(priority=1)//title 1
	public void validateTitle() {
		String title = feedback.validateFeedBackTitle();
		Assert.assertEquals(title, "Zero - Contact Us");
	}
	
	@Test(priority=2) //empty message 2
	public void sendEmptyMessage() {
		feedback.clickOnSubmit();
		String title = feedback.validateFeedBackTitle();
		Assert.assertTrue(feedback.checkNameIsDisplayed());
	}
	
	@Test(priority=3) //send valid message 3
	public void sendValidMessage() {
	
		feedback.nameType("ben");
		feedback.emailType("ben123@yahoo.com");
		feedback.subjectType("Hello");
		feedback.commentType("HelloWorld");
		feedback.clickOnSubmit();
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contentEquals("http://zero.webappsecurity.com/sendFeedback.html"));
		
	}
	
	@Test(priority=4) //invalid email 4
	public void sendInvalidEmail() {
		
		feedback.nameType("ben");
		feedback.emailType("ben123");
		feedback.subjectType("Hello");
		feedback.commentType("HelloWorld");
		feedback.clickOnSubmit();
		String title = driver.getCurrentUrl();
		Assert.assertFalse(title.contentEquals("http://zero.webappsecurity.com/sendFeedback.html"));
		
	}
	
	@Test(priority=5) // leave email blank 5
	public void sendEmptyEmail() {
		feedback.nameType("ben");
		feedback.emailType("");
		feedback.subjectType("Hello");
		feedback.commentType("HelloWorld");
		feedback.clickOnSubmit();
		String title = driver.getCurrentUrl();
		Assert.assertFalse(title.contentEquals("http://zero.webappsecurity.com/sendFeedback.html"));
	}
	
	@Test(priority=6) //leave subject empty 6
	public void sendEmptySubject() {
		feedback.nameType("ben");
		feedback.emailType("ben123@yahoo.com");
		feedback.subjectType("");
		feedback.commentType("HelloWorld");
		feedback.clickOnSubmit();
		Assert.assertTrue(feedback.checkNameIsDisplayed());
	}
	
	@Test(priority=7) //leave comment empty 7
	public void sendEmptyComment() {
		
		feedback.nameType("ben");
		feedback.emailType("ben123@yahoo.com");
		feedback.subjectType("Hello");
		feedback.commentType("");
		feedback.clickOnSubmit();
		Assert.assertTrue(feedback.checkNameIsDisplayed());
	}
	
	@Test(priority=8) //title 8
	public void validateFAQ() {
		feedback.clickOnFaq();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Zero - FAQ - Frequently Asked Questions");
	}
	
	
	@AfterMethod
	public void tearDown() {
		//driver.close();
		driver.quit();
	}
}
