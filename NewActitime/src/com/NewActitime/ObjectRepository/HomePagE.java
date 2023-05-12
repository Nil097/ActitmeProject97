package com.NewActitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagE {
	
	//Declaration
	@FindBy (xpath = "//div[.='Time-Track']")
	private WebElement timeC;
	
	@FindBy (xpath = "//div[.='Tasks']")
	private WebElement taskC;
	
	@FindBy (xpath = "//div[.='Reports']")
	private WebElement reportC;
	
	@FindBy (xpath = "//div[.='Users']")
	private WebElement userC;
	
 // initialization
	public HomePagE(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
 // utilization
	    public WebElement getTimeC() {
			return timeC;
		}

		public WebElement getTaskC() {
			return taskC;
		}

		public WebElement getReportC() {
			return reportC;
		}

		public WebElement getUserC() {
			return userC;
		}
}
