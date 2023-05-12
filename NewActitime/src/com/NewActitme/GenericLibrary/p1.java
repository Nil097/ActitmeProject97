package com.NewActitme.GenericLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class p1 {
WebDriver driver;
   @Test
   public void read() throws InterruptedException {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demo.actitime.com");
	   driver.findElement(By.name("username")).sendKeys("admin");
	  WebElement element = driver.findElement(By.name("pwd"));
	  element.sendKeys("manager");
	  driver.findElement(By.xpath("//div[.='Login ']")).click();
	  Thread.sleep(10000);
	  driver.close();
   }
}
