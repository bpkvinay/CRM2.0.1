package com.crm.neogrowth.GenricUtils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	
	public WebDriver driver;
	 WebDriverWait wait;

	/**
	 * @param driver
	 */
	public WebDriverUtility(WebDriver driver) {
		this.driver = driver;
	}
	
	   public void WaitForElement(WebElement elementaddress,long seconds)
	   {
       wait= new WebDriverWait(driver,seconds);
	   wait.until(ExpectedConditions.visibilityOf(elementaddress));
	   }
	   
	   public void Elementtobeclickable(long sec,WebElement locatoraddress) {
		 wait=new WebDriverWait(driver,sec);
		 wait.until(ExpectedConditions.elementToBeClickable(locatoraddress));
	   }
 
	   public void implcitywait(long sec) {
		   
		   driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	   
	   }}
