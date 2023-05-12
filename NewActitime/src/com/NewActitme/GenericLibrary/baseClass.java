package com.NewActitme.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.NewActitime.ObjectRepository.LoginPagE;

public class baseClass {

	public static WebDriver driver;
	FIleLLabrary f = new FIleLLabrary();
	
	
	
  @BeforeSuite
  public void dataBaseConnection() {
	  Reporter.log("database is connected successfully",true);
  }
  
  @BeforeClass
  public void launchhBrowser() throws EncryptedDocumentException, IOException {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	  driver.manage().window().maximize();
	  String url = f.readDataFromeExcelSheet("Sheet1", 6, 2);
	  driver.get(url);
	  Reporter.log("browser launched successfully",true);
  }
  
  @BeforeMethod
  public void preLogin() throws EncryptedDocumentException, IOException, InterruptedException {
	  String un = f.readDataFromeExcelSheet("Sheet1", 7, 2);
	  String pwd = f.readDataFromeExcelSheet("Sheet1", 8, 2);
	  LoginPagE pl = new LoginPagE(driver);
	  WebElement untf = pl.getUntf();
	  WebElement ppwd = pl.getPwtf();
	  WebElement login = pl.getLgnbtn();
	  Thread.sleep(5000);
	  untf.sendKeys(un);
	  ppwd.sendKeys(pwd);
	  login.click();
	  Reporter.log("actitime logged in successfully",true);
  }
  
  @AfterMethod
  public void postLogOut() {
	  LoginPagE pl = new LoginPagE(driver);
	  WebElement logout = pl.getLgoutbtn();
	  logout.click();
	  Reporter.log("actitime logged out successfully",true);
  }
  
  @AfterClass
  public void closedBrower() {
	  driver.close();
	  Reporter.log("browser close successfully",true);
  }
  
  @AfterSuite
  public void databaseDisconnection() {
	  Reporter.log("database is disconnected",true);
  }
  
	/*
	 * @Test public void automate() {
	 * Reporter.log("automation is successfull",true); }
	 */
}
