package com.NewActitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagE {
	// Declaration	
	@FindBy (name = "username")
	private WebElement untf;
	
	@FindBy (name = "pwd")
	private WebElement pwtf;
	
	@FindBy (xpath = "//div[.='Login ']")
	private WebElement lgnbtn;
	
	@FindBy (id = "logoutLink")
	private WebElement lgoutbtn;
	
  // Initialization
	public LoginPagE(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
  // Utilization
	public WebElement getUntf() {
		return untf;
	}

	public WebElement getPwtf() {
		return pwtf;
	}

	public WebElement getLgnbtn() {
		return lgnbtn;
	}

	public WebElement getLgoutbtn() {
		return lgoutbtn;
	}
	
}
