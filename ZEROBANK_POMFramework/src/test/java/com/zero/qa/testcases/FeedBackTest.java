package com.zero.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zero.qa.base.TestBase;
import com.zero.qa.pages.FeedBack;


public class FeedBackTest extends TestBase {

	FeedBack feedback;
	public FeedBackTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		feedback = new FeedBack();
	}
	
	@Test(priority=1) //title
	public void validateTitle() {
		String title = feedback.validateFeedBackTitle();
		Assert.assertEquals(title, "Zero - Contact Us");
	}
	
	@Test(priority=2) //empty message
	public void sendEmptyMessage() {
		feedback.clickOnSubmit();
		String title = feedback.validateFeedBackTitle();
		Assert.assertEquals(title, "Zero - Contact Us");
	}
	
	@Test(priority=3) //send valid message
	public void sendValidMessage() {
		feedback.nameType("ben");
		feedback.emailType("ben123@yahoo.com");
		feedback.subjectType("Hello");
		feedback.commentType("HelloWorld");
		feedback.clickOnSubmit();
		String title = feedback.validateFeedBackTitle();
		Assert.assertEquals(title, "Zero - Contact Us");
	}
	
	@Test(priority=4) //invalid email
	public void sendInvalidEmail() {
		feedback.nameType("ben");
		feedback.emailType("ben123");
		feedback.subjectType("Hello");
		feedback.commentType("HelloWorld");
		feedback.clickOnSubmit();
		String title = feedback.validateFeedBackTitle();
		Assert.assertEquals(title, "Zero - Contact Us");
	}
	
	@Test(priority=4) // leave email blank
	public void sendEmptyEmail() {
		feedback.nameType("ben");
		feedback.emailType("");
		feedback.subjectType("Hello");
		feedback.commentType("HelloWorld");
		feedback.clickOnSubmit();
		String title = feedback.validateFeedBackTitle();
		Assert.assertEquals(title, "Zero - Contact Us");
	}
	
	@Test(priority=5) //leave subject empty
	public void sendEmptySubject() {
		feedback.nameType("ben");
		feedback.emailType("ben123@yahoo.com");
		feedback.subjectType("");
		feedback.commentType("HelloWorld");
		feedback.clickOnSubmit();
		String title = feedback.validateFeedBackTitle();
		Assert.assertEquals(title, "Zero - Contact Us");
	}
	@Test(priority=6) //leave comment empty
	public void sendEmptyComment() {
		
		feedback.nameType("ben");
		feedback.emailType("ben123@yahoo.com");
		feedback.subjectType("Hello");
		feedback.commentType("");
		feedback.clickOnSubmit();
		String title = feedback.validateFeedBackTitle();
		Assert.assertEquals(title, "Zero - Contact Us");
	}
	
	@Test(priority=7) //title
	public void validateFAQ() {
		String title = feedback.validateFeedBackTitle();
		Assert.assertEquals(title, "Zero - FAQ - Frequently Asked Questions");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
