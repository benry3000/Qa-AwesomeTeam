package com.zero.qa.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.zero.qa.pages.Home;
import com.zero.qa.pages.LoginPage;

public class myThread extends Thread {
	
    public void run(){
    	
    	
    	String[] un = {"1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1"};
    	String[] pass = {"1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1"};
    	LoginPage login = new LoginPage();
    	System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options); 
    	
    	
    	driver.get("http://zero.webappsecurity.com/");
    	driver.findElement(By.id("signin_button")).click();
    	System.out.println("In Thread");
    	for(int i = 0; i < un.length; i++)
    	{
    		driver.findElement(By.id("user_login")).sendKeys(un[i]);
    		driver.findElement(By.name("submit")).click();
    	}
    	driver.close();
    	driver.quit();
    	
        
      }

}
