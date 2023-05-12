package com.NewActitime.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.NewActitime.ObjectRepository.HomePagE;
import com.NewActitime.ObjectRepository.TaskPagE;
import com.NewActitme.GenericLibrary.FIleLLabrary;
import com.NewActitme.GenericLibrary.ListenerImplementation_02;
import com.NewActitme.GenericLibrary.baseClass;
@Listeners(ListenerImplementation_02.class)
public class Task extends baseClass {
	
	@Test
	public void crreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		TaskPagE t = new TaskPagE(driver);
		FIleLLabrary f = new FIleLLabrary();
		Thread.sleep(5000);
		String create = f.readDataFromeExcelSheet("Sheet1", 9, 1);
		String descr = f.readDataFromeExcelSheet("Sheet1", 9, 2);
		String Actualresult = create;
		t.getTaskbtn().click();
		t.getAddnewbtn().click();
		t.getNewProject().click();
		Thread.sleep(5000);
		t.getEntProname().sendKeys(create);
		t.getDropdwn().click();
		Thread.sleep(5000);
		t.getNewCust().click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("Nilesh Rokade01");
		Thread.sleep(5000);
		t.getEntdescrpn().sendKeys(descr);
		t.getCreatPro().click();
		String Expectedresult = driver.findElement(By.xpath("(//div[.='"+create+"'])[2]")).getText();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(Actualresult, Expectedresult);
		sa.assertAll();
		
		}
}
