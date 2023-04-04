package Uttiles;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	
	
	public WebDriver driver;

	/**
	 * @param driver
	 */
	public WaitUtility(WebDriver driver) {
		this.driver = driver;
	}
	
	   public void WaitForElement(WebElement elementaddress,long seconds)
	   {
       WebDriverWait wait= new WebDriverWait(driver,seconds);
	   wait.until(ExpectedConditions.visibilityOf(elementaddress));
	   }    
 
	   public void implcitywait(long sec) {
		   
		   driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	   
	   }}
