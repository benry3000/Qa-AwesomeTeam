package com.zero.qa.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.zero.qa.pages.HomePage;
import com.zero.qa.base.TestBase;

//Login Page
public class LoginPage extends TestBase {
	
	//logo
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/a")
	WebElement logo;
	
	//userLogin
	@FindBy(name = "user_login")
	WebElement userLogin;
	
	//userPassword
	@FindBy(name = "user_password")
	WebElement userPassword;
	
	//UserRememberMe
	@FindBy(name = "user_remember_me")
	WebElement rememberMeCheckBox;
	
	//SignInBtn
	@FindBy(xpath = "//input[@type='submit' and @value='Sign in']")
	WebElement signInBtn;
	
	@FindBy(partialLinkText = "Forgot your password ?")
	WebElement forgotPass;
	
	//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateZEROLogo(){
			return logo.isDisplayed();
		}
		
		public Home login(String un, String pwd){
			userLogin.sendKeys(un);
			userPassword.sendKeys(pwd);
			//loginBtn.click();
			    	JavascriptExecutor js = (JavascriptExecutor)driver;
			    	js.executeScript("arguments[0].click();", signInBtn);
			    	
			return new Home();
		}
		
		public boolean validateCheckBox() {
			return rememberMeCheckBox.isSelected();
		}
		
		public void clickOnCheckBox(){
			rememberMeCheckBox.click();
		}
		public void clickOnForgotPass(){
			forgotPass.click();
		}
		
		public void stressInput() throws IOException
		{
			List<String> un = new ArrayList();
			List<String> pass = new ArrayList();
			
			File file = new File("C:\\Users\\benry.dong\\Documents\\Stress.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet st = wb.getSheetAt(0);
			Iterator<Row> rowLine = st.iterator();
			while(rowLine.hasNext()) {
				Row row = rowLine.next();
				un.add(row.getCell(0).toString());
				pass.add(row.getCell(1).toString());
			}
			
			wb.close();
			fis.close();
			
			for(int i = 0; i < un.size(); i++)
			{
				userLogin.sendKeys(un.get(i));
				userPassword.sendKeys(pass.get(i));
				signInBtn.click();
			}    	
			
		}
		
		public void spikeInput() throws IOException, InterruptedException
		{
			List<String> un = new ArrayList();
			List<String> pass = new ArrayList();
			
			File file = new File("C:\\Users\\benry.dong\\Documents\\Spike.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet st = wb.getSheetAt(0);
			Iterator<Row> rowLine = st.iterator();
			while(rowLine.hasNext()) {
				Row row = rowLine.next();
				un.add(row.getCell(0).toString());
				pass.add(row.getCell(1).toString());
			}
			
			wb.close();
			fis.close();
			Thread.sleep(2000); // 2 second delay
			for(int l = 0; l < 4; l++)
			{
				Thread.sleep(2000); //2 second intervals
				for(int i = 0; i < un.size(); i++)
				{
					userLogin.sendKeys(un.get(i));
					userPassword.sendKeys(pass.get(i));
					signInBtn.click();
				}   
			}
			
		}

		

}