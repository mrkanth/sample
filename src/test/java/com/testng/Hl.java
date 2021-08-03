package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hl {
	@Test
	public class firsttestngfile {
	    public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "F:\\Mywor\\soft\\chromedriver_win32\\chromedriver.exe";
	    public WebDriver driver ; 
	     
	 
	  public void verifyHomepageTitle() {
	       
	      System.out.println("launching chrome browser"); 
	      System.setProperty("webdriver.chrome.driver", driverPath);
	      driver = new ChromeDriver();
	      driver.get(baseUrl);
	      String expectedTitle = "Welcome: Mercury Tours";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      //driver.switchTo().frame
	      driver.close();
	  }
	}}
