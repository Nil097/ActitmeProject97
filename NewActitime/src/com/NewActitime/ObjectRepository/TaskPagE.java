package com.NewActitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPagE {
	// Declaration	
	@FindBy (xpath = "(//div[@class='label'])[2]")
	private WebElement taskbtn;
	
	@FindBy (xpath = "//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy (xpath = "//div[.='+ New Project']")
	private WebElement newProject;
	
	@FindBy (xpath = "(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement entProname;
	
	@FindBy (xpath = "(//div[@class='dropdownButton'])[15]")
	private WebElement dropdwn;
	
	@FindBy (xpath = "//div[.='-- New Customer --']")
	private WebElement newCust;
	
	@FindBy (xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement entdescrpn;
	
	@FindBy (xpath = "//div[.='Create Project']")
	private WebElement creatPro;
	
	@FindBy (xpath = "(//div[.='Cancel'])[27]")
	private WebElement cancelbtn;
	
  // Initialization
	public TaskPagE(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
  // Utilization
	    public WebElement getTaskbtn() {
			return taskbtn;
		}

		public WebElement getAddnewbtn() {
			return addnewbtn;
		}

		public WebElement getNewProject() {
			return newProject;
		}

		public WebElement getEntProname() {
			return entProname;
		}

		public WebElement getDropdwn() {
			return dropdwn;
		}

		public WebElement getNewCust() {
			return newCust;
		}

		public WebElement getEntdescrpn() {
			return entdescrpn;
		}

		public WebElement getCreatPro() {
			return creatPro;
		}

		public WebElement getCancelbtn() {
			return cancelbtn;
		}
	
	
}
